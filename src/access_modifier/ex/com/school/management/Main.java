package access_modifier.ex.com.school.management;

public class Main {
    public static void main(String[] args) {
        // 객체 생성 -> 변수 선언
        Student student = new Student("김철수", "ABCD1234");

        // 정보 가져오기 -> getter
        System.out.println("이름 : " + student.getName());
        System.out.println("학번 : " + student.getStudentId());

        // 정보 변경하기 -> setter
        student.setName("김서준");
        student.setStudentId("BCDE2345");

        // 변경된 정보 출력
        System.out.println("이름 : " + student.getName());
        System.out.println("학번 : " + student.getStudentId());

    }
}
