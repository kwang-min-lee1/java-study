package collection.set.compare;

public class Person implements Comparable<Person>{

    // 필드
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // 나이 기준으로 정수 비교: 음수, 0, 양수
        int ageCompared = Integer.compare(this.age, other.age);// return this.age - other.age;
        // 나이가 같을 경우 이름순(2)으로 비교
        if (ageCompared == 0) {
            int nameCompared = this.name.compareTo(other.name);
            return nameCompared;
        }
        // 나이가 다르면 나이순(1) 비교
        return ageCompared;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


