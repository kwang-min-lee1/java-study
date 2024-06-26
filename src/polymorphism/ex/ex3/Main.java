package polymorphism.ex.ex3;

public class Main {

    /*
문제 3: 도형 계산기

다양한 도형의 면적을 계산하는 계산기를 객체 지향 프로그래밍 방식으로 설계하고 구현하는 것이 목표입니다. 이 시스템에서는 추상 클래스와 상속을 활용하여 여러 종류의 도형(예: 원, 사각형, 삼각형)을 모델링해야 합니다.

요구사항:
Shape라는 추상 클래스를 만듭니다. 이 클래스는 area() 메서드를 포함해야 하며, 이 메서드는 도형의 면적을 계산하여 반환합니다.
Circle, Rectangle, Triangle 클래스를 만들고, 이들 각각이 Shape 클래스를 상속받도록 합니다. 각 클래스는 area() 메서드를 자신의 도형 타입에 맞게 구현해야 합니다.
각 도형 클래스의 객체를 생성하고, 그 객체들을 이용해 면적을 계산하고 출력해봅니다.

출력 예시:
Circle의 area() 메서드는 "원의 면적: [결과값]"를 출력합니다.
Rectangle의 area() 메서드는 "사각형의 면적: [결과값]"를 출력합니다.
Triangle의 area() 메서드는 "삼각형의 면적: [결과값]"를 출력합니다.
     */
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 30);
        Shape triangle = new Triangle(20, 30);

        System.out.println("원의 면적 : " + circle.area());
        System.out.println("사각형의 면적 : " + rectangle.area());
        System.out.println("삼각형의 면적 : " + triangle.area());

    }
}
