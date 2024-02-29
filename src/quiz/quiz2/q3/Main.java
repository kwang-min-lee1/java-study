package quiz.quiz2.q3;

public class Main {
    public static void main(String[] args) {

        // 도형의 객체 생성
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(3,4);

        // 출력
        System.out.println("원의 면적: " + circle.area());
        System.out.println("사각형의 면적: " + rectangle.area());
        System.out.println("삼각형의 면적: " + triangle.area());
    }
}
