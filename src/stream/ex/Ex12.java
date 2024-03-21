package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
      연습 문제: 직원들의 급여 집계하기
  회사 직원들의 정보가 다음과 같이 주어져 있습니다.
  모든 직원의 총 급여와, 직책별 평균 급여를 계산하세요.

  record Employee(String name, String role, int salary) {}


  List<Employee> employees = Arrays.asList(
      new Employee("Alice", "Developer", 5000),
      new Employee("Bob", "Developer", 6000),
      new Employee("Charlie", "Manager", 7000),
      new Employee("David", "Manager", 8000)
  );

  // 목표 1: 모든 직원의 총 급여 계산하기
  // 목표 2: 직책별 평균 급여 계산하기

  출력예시
  ===
  총 급여: 26000
  Developer 평균 급여: 5500.0
  Manager 평균 급여: 7500.0
       */
public class Ex12 {
    public static void main(String[] args) {
        record Employee(String name, String role, int salary) {}


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        // 목표 1: 모든 직원의 총 급여 계산하기
        Integer totalSalary = employees.stream()
                .collect(Collectors.summingInt(Employee::salary));

        System.out.println("총 급여 : " + totalSalary);

        // 다른 방법
//        int total = employees.stream()
//                .mapToInt(Employee::salary)
//                .sum();
//
//        System.out.println("총 급여:= " + total);

        // 목표 2: 직책별 평균 급여 계산하기
        // toMap : 키, 값 쌍으로 함수를 통해 각 요소에서 추출
        Map<String, Double> byRoleSalaryAverage = employees.stream()
                .collect(Collectors.groupingBy(Employee::role,
                        Collectors.averagingDouble(Employee::salary)
                ));

        byRoleSalaryAverage.forEach(
                (role, salaryAvg) ->
                        System.out.printf("%s 평균 급여 : %.1f\n", role, salaryAvg)
        );


    }
}
