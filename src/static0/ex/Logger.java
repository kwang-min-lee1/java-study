package static0.ex;

public class Logger {
    // 필드
    static String logLevel = "INFO";

    // 메서드
    public static void logInfo(String s) {
        System.out.println("[INFO] " + s);
    }

    public static void logError(String s) {
        if (logLevel.equals("ERROR")) {
            System.out.println("[ERROR] " + s);
        }
    }

    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }
}
