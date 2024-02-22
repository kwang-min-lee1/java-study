package inheritance;

import access_modifier.second.C;

public class Child extends Parent{
    String field = "child";

    @Override
    public void callMethod() {
        System.out.println("자식 클래스의 메서드");
    }

    public void test(){

        //this : 자기 자신을 참조한다. (생략 가능)
        //super : 부모 클래스를 참조한다.
        System.out.println("this.field : " + this.field); // Child 자기자신 필드
        System.out.println("super.field : " + super.filed); // parent

        this.callMethod(); // 자식 클래스
        super.callMethod(); // 부모 클래스
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test();

    }

}
