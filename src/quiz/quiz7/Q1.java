package quiz.quiz7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
직원들의 급여 집계하기

    회사 직원들의 정보가 다음과 같이 주어져 있습니다. 모든 직원의 총 급여와, 직책별 평균 급여를 계산하세요.

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
public class Q1 {
    public static void main(String[] args) {

        // 직원들을 나타내는 Employee 객체들을 생성하고, 이들을 리스트에 추가
        // Arrays.asList() 메서드를 사용하여 리스트를 생성
        // 이 메서드는 인자로 전달된 요소들을 포함하는 리스트를 반환
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        // 목표 1: 모든 직원의 총 급여 계산하기
        // calculateTotalSalary() 메서드를 호출하여 모든 직원의 총 급여를 계산
        // 이 값을 totalSalary 변수에 저장
        int totalSalary = calculateTotalSalary(employees);

        // 모든 직원의 총 급여 출력
        System.out.println("총 급여: " + totalSalary);

        // 목표 2: 직책별 평균 급여 계산하기
        // calculateAverageSalariesByRole() 메서드를 호출하여 직책별 평균 급여를 계산
        // 계산된 평균 급여가 직책을 키로 하고, 평균 급여를 값으로 가지는 맵이 반환
        // 이 맵을 averageSalariesByRole 변수에 저장
        Map<String, Double> averageSalariesByRole = calculateAverageSalariesByRole(employees);

        // 직책별 평균 급여를 출력
        // averageSalariesByRole 맵의 각 항목을 반복하면서, 직책과 해당 평균 급여를 출력
        for (Map.Entry<String, Double> entry : averageSalariesByRole.entrySet()) {
            System.out.println(entry.getKey() + " 평균 급여: " + entry.getValue());
        }

    }

    // calculateTotalSalary() 메서드 정의
    // List<Employee> 타입의 매개변수 employees 를 받는다
    static int calculateTotalSalary(List<Employee> employees) {
        // 총 급여를 나타내는 변수 totalSalary 를 초기화
        int totalSalary = 0;
        // 리스트에 있는 각각의 직원에 대해 반복
        for (Employee employee : employees) {
            // 현재 직원의 급여를 총 급여에 더한다.
            totalSalary += employee.salary;
        }
        // 총 급여를 반환
        return totalSalary;
    }

    // calculateAverageSalariesByRole 라는 이름의 정적 메서드를 정의
    //  Map<String, Double> 타입의 값을 반환
    // 이 메서드는 List<Employee> 타입의 매개변수 employees 를 받는다
    private static Map<String, Double> calculateAverageSalariesByRole(List<Employee> employees) {
        // 각 직책별 총 급여와 해당 직책의 직원 수를 추적하기 위해 두 개의 HashMap 을 생성
        // totalSalaryByRole 은 직책을 키로 하고 총 급여를 값으로 가지고,
        // countByRole 은 직책을 키로 하고 해당 직책의 직원 수를 값으로 가진다.
        Map<String, Integer> totalSalaryByRole = new HashMap<>();
        Map<String, Integer> countByRole = new HashMap<>();

        // 리스트에 있는 각각의 직원에 대해 반복
        for (Employee employee : employees) {
            // 현재 직원의 직책을 키로 하는 totalSalaryByRole 맵에 현재 직원의 급여를 추가
            // 해당 직책에 대한 항목이 없으면 새로운 항목을 추가하고, 이미 있는 경우에는 기존 값에 현재 직원의 급여를 더한다.
            totalSalaryByRole.put(employee.role, totalSalaryByRole.getOrDefault(employee.role, 0) + employee.salary);
            // 해당 직책을 키로 하는 countByRole 맵에 1을 더한다.
            // 해당 직책에 대한 항목이 없으면 새로운 항목을 추가하고, 이미 있는 경우에는 기존 값에 1을 더한다.
            countByRole.put(employee.role, countByRole.getOrDefault(employee.role, 0) + 1);
        }
        // 직책별 평균 급여를 저장할 빈 맵을 생성
        Map<String, Double> averageSalariesByRole = new HashMap<>();
        // totalSalaryByRole 맵의 각 항목에 대해 반복
        for (Map.Entry<String, Integer> entry : totalSalaryByRole.entrySet()) {
            // 현재 항목의 키를 직책으로, 값은 총 급여로 가져온다
            String role = entry.getKey();
            int totalSalary = entry.getValue();
            // 현재 직책에 해당하는 직원 수를 가져온다.
            int count = countByRole.get(role);
            // 현재 직책의 평균 급여를 계산 (총 급여를 직원 수로 나눈 값을 사용)
            double averageSalary = (double) totalSalary / count;
            // 계산된 평균 급여를 averageSalariesByRole 맵에 추가
            averageSalariesByRole.put(role, averageSalary);
        }
        // 직책별 평균 급여가 저장된 맵을 반환
        return averageSalariesByRole;
    }



    // Employee 클래스를 정의 (직원의 이름, 직책, 급여)
    static class Employee {
        String name;
        String role;
        int salary;

        public Employee(String name, String role, int salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }
    }
}
