package variable;

public class Ex5 {
    public static void main(String[] args) {
        /*
        이름: 홍길동
        나이: 25
        전화:010-1234-5678
         */
        String name ="홍길동";
        int age =25;
        String tel1="010", tel2="1234", tel3="4567";

        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("전화:" + tel1 + "-" + tel2 + "-" +tel3 );

        System.out.print("이름:" + name +"\n");
        System.out.print("나이:" + age +"\n");
        System.out.print("전화:"  + tel1 + "-" + tel2 + "-" +tel3 +"\n");

        System.out.printf("이름: %s\n" , name);
        System.out.printf("나이: %d\n" , age );
        System.out.printf("전화: %s-%s-%s\n", tel1 , tel2 ,tel3);

    }
}
