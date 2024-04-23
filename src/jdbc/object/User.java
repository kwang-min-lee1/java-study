package jdbc.object;

import java.util.Objects;

// user 테이블에 대응하는 클래스
// VO: Value Object, 데이터를 전달하는 데 사용되는 객체
// 데이터 전달 역할만 하고, 별도의 로직은 가지고 있지 않음
// 1. 불변성: 설정 이후에는 값이 변하지 않음
// 2. 동등성: 내용이 같으면 같은 인스턴스
// 3. 재사용성: 같은 구조를 계속 공통적으로 사용

public class User {
    // 필드는 테이블의 속성(컬럼)
    private  String userId;
    private  String userName;
    private  String password;
    private  int age;
    private  String email;

    public User(String userId, String userName, String password, int age, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 동등성을 위해 hashCode 와 equals 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
