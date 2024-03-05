package library.lang.ex.ex3;

import java.util.Objects;

public class Person {

    // hashCode() 메서드와 equals() 메서드를 오버라이딩하여 구현하세요.
    // age 만 사용하는 경우, name, age 필드 모두 사용하는 경우


    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);

        System.out.println(person1.hashCode()); // 318734572
        System.out.println(person2.hashCode());  // 123456789
        System.out.println(person1.equals(person2)); // false
    }



}
