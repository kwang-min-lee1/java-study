package class1;

public class Student {

    // 필드
    String name; //이름
    int score;  //성적
    int age; // 나이


    // 생성자 : 초기값을 할당하는 역할
    Student() {
        // 기본 생성자
        System.out.println(" 기본 생성자 호출");
    }

    // 생성과 함께 초기화를 시켜주는 생성자
    Student(String name,int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    //메서드

    //초기화 메서드
    void initStudent(String nameParameter, int score, int age) {
        //필드와 매개변수의 이름이 같아서 데이터가 입력되지 않을 때,
        name = nameParameter;  // 1. 이름을 다르게 한다.
        this.score = score;  // 2. this 키워드를 사용한다.
        this.age =  age;
        // 객체의 필드값(age)에 매개변수(age)를 대입하겠다.
        // this 는 객체 자신을 참조하는 참조 변수

    }

}
