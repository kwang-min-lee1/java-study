package class0;

public class Class5 {
    public static void main(String[] args) {
        Student student1 = createStudent("홍길동", 80, 30); // 객체의 참조값을 받는다.
        Student student2 = createStudent( "임꺽정", 70, 40);

        printInformation(student1);
        printInformation(student2);

    }

    // 학생 객체의 필드 값을 읽어서 출력하는 메서드
    private static void printInformation(Student students) {
        System.out.println("[ 학생 이름 : " + students.name + ", 점수 : " + students.score + " 나이 : " + students.age + " ]");
    }

    // 학생 객체를 생성해주는 메소드
    public static Student createStudent(String name, int score, int age) {
        Student student = new Student();    // 생성된 객체(학생 타입의 인스턴스)는 Heap 에 던져짐.
        student.name = name;
        student.score = score;
        student.age = age;
        return student;     // 객체(객체의 참조값 => 0x100)
    }
}
