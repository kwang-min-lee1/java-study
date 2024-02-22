package inheritance.ex;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" 학번은" + studentId + "입니다.");
    }
}
