package access_modifier.ex.com.school.management;

public class Student {
     /*
    인스턴스 변수: name, studentId
    생성자: Student(String name, String studentId)로 학생의 이름과 ID를 초기화
    게터와 세터: 각 변수에 대한 public 게터와 세터 메서드
     */

    // 필드 : 필드를 접근 불가하게 캡슐화
    private String name;
    private String studentId;

    // 생성자
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 메서드
    // 필드의 값을 가져오는 getter
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    // 필드의 값을 설정하는 setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}



