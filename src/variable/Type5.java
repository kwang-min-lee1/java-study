package variable;

public class Type5 {
    public static void main(String[] args) {
        byte v1 =10;
        int v2 =100;
        long v3 =1000L;

        // 정수 연산 시 가장 큰 타입에 넣으면 자동변환(promotion) 된다
        long result = v1 + v2 + v3;

        //강제 변환 시
        int result2 =(int) (v1 + v2 + v3);  //작은 타입으로 담을 시 컴파일 에러 발생
        // 캐스팅을 통해 변환 가능

        int v4 = 10 / 4;
        System.out.println("v4="+v4);

        // int v5 = 10 /4.0; //컴파일 에러 발생
        double v6 = 10 / 4; // int/int = (int)2  ->(double) 2.0
        double v7 = 10 / 4.0; // int/ double = (double) 2.5
        System.out.println("v6="+v6);
        System.out.println("v7="+v7);

    }
}
