package collection.list.ex.ex3;

public class Friend {
    private String name;
    private String email;
    private String phoneNumber;

    public Friend(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "친구정보{" +
                "이름='" + name + '\'' +
                ", 이메일='" + email + '\'' +
                ", 전화번호='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
