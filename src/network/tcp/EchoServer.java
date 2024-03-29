package network.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args)  {
        // 서버 측에서 사용되는 ServerSocket 클래스
        // 포트번호를 인자로 받음
        // accept(): 클라이언트의 요청을 기다리고, 요청이 들어오면
        // 해당 클라이언트와 통신을 하는 Socket 객체를 반환

        // 서버가 사용할 포트 번호를 설정
        int portNumber = 50001;

        //  서버 소켓을 생성하고 지정된 포트 번호에 바인딩
        try ( ServerSocket serverSocket = new ServerSocket(portNumber);
        ) {
            System.out.println("서버를 시작하고 클라이언트의 연결을 기다립니다.");
            try(
                    // 클라이언트 소켓에서 InputStream, OutputStream 을 받는다.

                    // 클라이언트의 연결을 기다리고, 연결이 수락되면 클라이언트와의 통신을 위한 소켓을 반환한다.
                    // 클라이언트 소켓을 받아온다.
                    Socket clientSocket = serverSocket.accept();

                    // 클라이언트 소켓에 데이터를 보내기 위한 출력 스트림을 가져온다.
                    OutputStream outputStream = clientSocket.getOutputStream();

                    //  클라이언트로 데이터를 보내기 위한 PrintWriter 를 설정한다.
                    PrintWriter out = new PrintWriter(outputStream, true);

                    // 클라이언트 소켓에서 데이터를 읽기 위한 입력 스트림을 가져온다.
                    InputStream inputStream = clientSocket.getInputStream();

                    // 클라이언트로부터의 입력을 읽기 위한 BufferedReader 를 설정한다.
                    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

            ) {
                System.out.println("클라이언트의 연결을 받았습니다.");

                // 무한 루프를 사용하여 클라이언트로부터 메시지를 읽고 보내는 작업을 반복한다.
                while (true) {

                    //클라이언트로부터 한 줄씩 메시지를 읽어온다.
                    String line = in.readLine();
                    // 클라이언트로부터 입력을 받는다.
                    if (line == null) break;
                    System.out.println("서버가 클라이언트에서 받은 메시지: " + line);

                    // 클라이언트에서 받은 메시지를 다시 클라이언트로 되돌려 보낸다.
                    out.println(line);

                }
            }
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다.");
            //  예외가 발생했을 때 오류 메시지를 출력한다.
            System.out.println(e.getMessage());
        }

    }
}
