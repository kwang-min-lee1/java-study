package exception;

public class WrongMonthMain {
    public static void main(String[] args) {
        try {
            setMonth(5);
            setMonth(10);
            setMonth(13);
            // unchecked : 컴파일러에서 예외처리를 강제하지 않는다.
        } catch (WrongMonthException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new WrongMonthException(month);
            // 예외가 발생하면 아래 코드들은 수행되지 않는다.
        }
        System.out.println(month + "월로 설정되었습니다.");
    }
}
