package quiz.quiz2.q3;

public class Circle extends Shape{

    private  double radius; // 반지름
    public Circle(double radius) {
        this.radius = radius;
    }

    // 원 넓이
    @Override
    double area() {
        return Math.PI * radius *radius;
    }
}
