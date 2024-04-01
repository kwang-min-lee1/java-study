package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/// 서버 챗 최종 정리

public class ChatServer_1 {
    // 채팅 서버로 사용할 포트번호
    private static final int PORT = 12345;
    // 채팅에 접속한 클라이언트 리스트 : 스레드 안전한 클래스로 생성
    private static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        // 특정 포트에서 클라이언트 연결을 기다린다.
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.printf("채팅 서버가 %s 포트에서 실행 중입니다\n", PORT);

            // 무한 루프로 대기하면서 클라이언트가 접속할 때마다
            // 클라이언트 소켓을 생성하고 스레드 시작하고 대기
            while (true) {
                Socket clientSocket = serverSocket.accept();

                // 각 접속하는 클라이언트 소켓마다
                ClientHandler clientHandler = new ClientHandler(clientSocket);      // 핸들러 생성
                clients.add(clientHandler);                                         // 리스트에 추가
                clientHandler.start();                                              // 스레드 시작
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 클라이언트의 접속에 관련된 것을 다루는 내부 클래스
    // (각 실행 내용을 스레드로 관리)
    private static class ClientHandler extends Thread {
        // 필드
        private Socket socket;      // 클라이언트 연결 소켓
        private PrintWriter out;    // 출력스트림
        private BufferedReader in;  // 입력스트림
        private String name;        // 클라이언트 대화명
        private String hostAddress; // 클라이언트 IP

        // 생성 시, 서버 소켓으로부터 소켓 정보를 받는다.
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 스레드가 시작되면 입출력 스트림 할당
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // IP 알아내기
                hostAddress = socket.getInetAddress().getHostAddress();

                // 대화명 입력
                out.println("대화명을 입력해주세요 : ");      // 클라이언트에게 출력
                name = in.readLine();            // 클라이언트에게 대화명 입력 받음

                // 입장 메시지 모두에게 출력
                String welcomeMsg = name + ":" + hostAddress + "님이 입장하셨습니다.";
                broadcastMessage(welcomeMsg);

                // 클라이언트로부터 메시지를 받아서 출력
                while (true) {
                    String fromUser = in.readLine();
                    if (fromUser == null) break;  // 입력받은 값 null 처리 할 것!

                    // 채팅 메시지 모두에게 출력
                    String chatMsg = String.format("[%s:%s] : %s", name, hostAddress, fromUser);
                    broadcastMessage(chatMsg);

                }
            } catch (IOException e) {
                System.out.println("예외가 발생했습니다. " + e.getMessage());
            } finally {
                // 채팅을 종료한 클라이언트 리스트에서 제거하기
                clients.remove(this);

                // 종료 메시지 모두에게 출력
                String exitMsg = String.format("%s 님이 나가셨습니다.", name);
                broadcastMessage(exitMsg);
            }
        }

        // 모두에게 메시지를 보내는 메서드
        private void broadcastMessage(String message) {
            // 모든 클라이언트에게 메시지 출력
            for (ClientHandler client : clients) {
                client.out.println(message);
            }
            // 서버에게 메시지 출력
            System.out.println(message);
        }
    }
}
