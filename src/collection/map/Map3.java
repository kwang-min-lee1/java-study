package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Map3 {
    static class Student {
        public int studentNo;
        String name;

        public Student(int studentNo, String name) {
            this.studentNo = studentNo;
            this.name = name;
        }
        @Override
        public String toString() {
            return studentNo +  " " + name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentNo, name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentNo == student.studentNo && Objects.equals(name, student.name);
        }
    }
    public static void main(String[] args) {

        // Key 에 참조타입 객체(사용자 정의 타입)이 HashMap 에 사용되면
        // 동등성을 확인하는 로직으로 equals 와 hashCode 를 오버라이딩 해야 한다.

        Map<Student,Integer> stusentMap = new HashMap<>();

        stusentMap.put(new Student(1,"홍길동"),90);
        stusentMap.put(new Student(1,"홍길동"),95);

        System.out.println("size : " + stusentMap.size());
        System.out.println(stusentMap);


    }

}
