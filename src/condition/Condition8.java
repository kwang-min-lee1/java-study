package condition;

public class Condition8 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNumber = (int) ((Math.random() *6) + 1);// 1~6까지 랜덤한 난수 생성
        System.out.println(diceNumber);

        switch (diceNumber) {
            case 1:
                System.out.println("주사위 1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("주사위 2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("주사위 3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("주사위 4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("주사위 5번이 나왔습니다.");
                break;
            default:
                System.out.println("주사위 6번이 나왔습니다.");
                break;
        }

    }
}
