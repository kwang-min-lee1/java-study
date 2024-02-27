package solid.srp.after;

public class EmployeeRepository {
    //데이터베이스에 관련된 하니의 책임만 가짐.
    //데이터베이스에서 직원 정보를 저장하는 로직

    public void save(Employee employee) {
        System.out.println("직원 정보 저장");
    }
}
