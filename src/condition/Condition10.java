package condition;

public class Condition10 {
    public static void main(String[] args) {
        int diceNumber = (int) ((Math.random() *6) + 1);// 1~6까지 랜덤한 난수 생성


       //향상된 switch문 : 자바 14버젼 이후부터 도입
        switch (diceNumber) {
            case 1 -> System.out.println("주사위 1번이 나왔습니다.");
            case 2 -> System.out.println("주사위 2번이 나왔습니다.");
            case 3 -> System.out.println("주사위 3번이 나왔습니다.");
            case 4 -> System.out.println("주사위 4번이 나왔습니다.");
            case 5 -> System.out.println("주사위 5번이 나왔습니다.");
            default ->System.out.println("주사위 6번이 나왔습니다.");
        }
    }
}
