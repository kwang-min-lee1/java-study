package stream;

public class Student implements Comparable<Student>{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.getName());
    }
}
