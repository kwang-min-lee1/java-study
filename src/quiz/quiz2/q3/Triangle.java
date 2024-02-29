package quiz.quiz2.q3;

public class Triangle extends Shape {

    private double base; // 밑변
    private double height; // 높이

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    // 넓이
    @Override
    double area() {
        return (base * height) / 2;

    }
}
