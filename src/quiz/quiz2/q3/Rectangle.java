package quiz.quiz2.q3;

public class Rectangle extends Shape{

    private double width;  // 너비
    private double height; // 높이

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 넓이
    @Override
    double area() {
        return width * height;
    }
}
