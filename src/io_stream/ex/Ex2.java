package io_stream.ex;


import java.io.*;

/*
  문제: 로그 파일 분석기

  문제 설명
  로그 파일을 분석하는 자바 프로그램을 작성해야 합니다.
  이 프로그램은 로그 파일에서 "에러(ERROR)"가 발생한 모든 라인을 찾아
  그 내용을 별도의 파일("errorLogs.txt")에 저장해야 합니다.
  로그 파일의 경로는 프로그램 실행 시 사용자로부터 입력받으며,
  분석 완료 후 사용자에게 "분석 완료" 메시지와 함께 에러 로그의 총 개수를 출력해야 합니다.

  요구 사항
  - 로그 파일 경로 분석 : 로그 파일은 server.log 에 저장되어 있습니다.
  - 에러 로그 분석: 로그 파일을 읽고, "ERROR"라는 단어가 포함된 모든 라인을 찾습니다.
  - 결과 저장: 찾은 에러 로그를 "errorLogs.txt" 파일에 저장합니다.
              각 - 에러 로그는 파일의 새로운 줄에 기록되어야 합니다.
  - 분석 결과 출력: 에러 로그의 총 개수와 함께 사용자에게 분석이 완료되었음을 알립니다.

  server.log
  ===
  2021-01-01 11:45:00 INFO 서버 시작
  2021-01-01 11:47:25 WARNING 설정 파일 누락
  2021-01-01 11:47:30 INFO 사용자 로그인 성공: user123
  2021-01-01 11:50:00 ERROR 데이터베이스 연결 실패
  2021-01-01 11:52:15 INFO 사용자 로그인 성공: admin
  2021-01-01 11:53:00 WARNING 메모리 사용량 과다
  2021-01-01 11:55:00 ERROR 이메일 서비스 불응
  2021-01-01 11:57:00 INFO 서버 정상 작동 중
  2021-01-01 12:00:00 ERROR 사용자 인증 실패: user456
  2021-01-01 12:05:00 INFO 사용자 로그아웃: user123
  2021-01-01 12:07:00 WARNING 디스크 공간 부족
  2021-01-01 12:10:00 ERROR 파일 업로드 실패: /path/to/file.jpg
  2021-01-01 12:15:00 INFO 사용자 로그인 성공: user789
  2021-01-01 12:20:00 ERROR 보안 위반 시도 감지


  실행예시
  ===
  분석 완료. 총 5개의 에러 로그를 찾았습니다.

  errorLogs.txt
  ===
  2021-01-01 11:50:00 ERROR 데이터베이스 연결 실패
  2021-01-01 11:55:00 ERROR 이메일 서비스 불응
  2021-01-01 12:00:00 ERROR 사용자 인증 실패: user456
  2021-01-01 12:10:00 ERROR 파일 업로드 실패: /path/to/file.jpg
  2021-01-01 12:20:00 ERROR 보안 위반 시도 감지

   */
public class Ex2 {
    public static void main(String[] args) throws IOException {

        String src = "src/io_stream/ex/server.log";
        String src1 = "src/io_stream/ex/errorLogs.txt";

        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(src1));

        while (true) {
            String line = br.readLine(); // 파일에서 한 줄 씩 읽음

            if (line.contains("ERROR")) {
                bw.write(line);
            }
            System.out.println(line);
        }
        br.close();


        // 버퍼에서 읽은 길이만큼, 문자열을 출력
        System.out.println(new String(buffer, 30, length));

    }
}
