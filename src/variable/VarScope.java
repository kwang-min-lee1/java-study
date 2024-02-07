package variable;

public class VarScope { // 클래스 블록
    public static void main(String[] args) { // 매소드 블록

        // 변수의 사용범위
        // 자바의 모든 변수는 중괄호 블록 내에서 선언되고 사용됩니다.

        int value = 10; // 지역(local) 변수

        // 변수는 블록 내 어디에서나 선언할 수 있지만,
        // 사용할 때는 자신이 선언된 위치로부터 자신이 속한 블록 내부에서만 사용 가능
        // 해당 블록을 벗어나면 선언된 변수가 소멸된다.

        value = 20;
        System.out.println(value);

        if (value > 10) {
            int localVal = 30;
            System.out.println(value+localVal);
            // 바깥 블록에서 선안한 변수는 내부에서 사용 가능
        }

//      System.out.println(localValue); // 안쪽에서 벗어난 범위 사용 불가 -> 컴파일 에러발생

    }
    // value  // <-- 블록을 벗어나면 사용할 수 없다.
}
