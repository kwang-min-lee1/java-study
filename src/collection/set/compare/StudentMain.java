package collection.set.compare;

import java.util.Arrays;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Student 홍길동 = new Student("홍길동",30,170.0);
        Student 임꺽정 = new Student("임꺽정",40,185.0);
        Student 전우치 = new Student("전우치",25,175.0);
        Student 허생 = new Student("허생",45,163.0);

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.addAll(
                Arrays.asList(홍길동, 임꺽정, 전우치, 허생)
        );

        for (Student student : studentTreeSet) {
            System.out.println(student);
        }


        System.out.println("======이름 순 정렬=========");
        // 이름 비교자 생성
        StudentComparator nameStudentComparator =
                new StudentComparator(
                        StudentComparator.SortBy.NAME,
                        StudentComparator.SortDirection.ASC);

        // 정렬 기준으로 이름 비교자
        TreeSet<Student> nameSortSet = new TreeSet<>(nameStudentComparator);

        // 정렬 대상 삽입
        nameSortSet.addAll(
                Arrays.asList(홍길동, 임꺽정, 전우치, 허생)
        );

        for (Student student : nameSortSet) {
            System.out.println(student);
        }

        TreeSet[] treeSets = {
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.AGE,
                                StudentComparator.SortDirection.ASC
                        )
                ),
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.HEIGHT,
                                StudentComparator.SortDirection.ASC
                        )
                )
        };
        for (TreeSet<Student> treeSet : treeSets) {
            treeSet.addAll(
                    Arrays.asList(홍길동, 임꺽정, 전우치, 허생)
            );
            System.out.println("=================================");
            for (Student student : treeSet) {
                System.out.println(student);
            }
        }

    }
}
