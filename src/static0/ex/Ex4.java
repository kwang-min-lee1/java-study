package static0.ex;

public class Ex4 {
     /*
    문제4 : 로깅 유틸리티 클래스 만들기

    1. Logger 클래스:

    static 변수를 사용하여 현재 로깅 레벨을 저장합니다.
    로깅 레벨은 INFO, ERROR 등의 값을 가질 수 있습니다.
    필드  (logLevel)

    static 메소드 logInfo와 logError를 구현하여 각각 정보 및 오류 메시지를 출력합니다.
    출력 형식은 [INFO] 메시지 또는 [ERROR] 메시지와 같이 해야 합니다.
    현재 로깅 레벨에 따라 logInfo 메소드는 항상 메시지를 출력하고,
     logError 메소드는 ERROR 메시지만 출력합니다.

    2. Main 클래스:

    Logger 클래스를 사용하여 다양한 메시지를 로깅합니다.
    로깅 레벨을 변경하고, 이에 따라 출력되는 메시지를 확인합니다.
    public static void main(String[] args) {
        Logger.logInfo("앱이 시작되었습니다...");
        Logger.logError("에러 메시지입니다.");

        Logger.setLogLevel("ERROR");
        Logger.logInfo("ERROR 레벨이 세팅되었을 때 출력되는 INFO 메시지입니다.");
        Logger.logError("ERROR 레벨이 세팅되었을 때 출력되는 ERROR 메시지입니다.");
        }

    예상 실행결과
    ====
    [INFO] 앱이 시작되었습니다...
    [INFO] ERROR 레벨이 세팅되었을 때 출력되는 INFO 메시지입니다.
    [ERROR] ERROR 레벨이 세팅되었을 때 출력되는 ERROR 메시지입니다.
     */
     public static void main(String[] args) {
         Logger.setLogLevel("INFO");
         Logger.logInfo("앱이 시작되었습니다...");
         Logger.logError("에러 메시지입니다.");

         Logger.setLogLevel("ERROR");
         Logger.logInfo("ERROR 레벨이 세팅되었을 때 출력되는 INFO 메시지입니다.");
         Logger.logError("ERROR 레벨이 세팅되었을 때 출력되는 ERROR 메시지입니다.");
     }

}
