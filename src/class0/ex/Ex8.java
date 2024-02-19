package class0.ex;

public class Ex8 {
    public static void main(String[] args) {
        // 1. 동물(Animal) 클래스를 정의
        // 동물의 종류, 이름, 나이를 데이터로 가지고 동물의 정보를 출력하는 메서드를 가짐
        // 2. 해당 클래스를 메인메소드에 생성하고 사용해보세요.
        Animal animal = new Animal();
        animal.type = "고양이";
        animal.name = "야옹이";
        animal.age = 3;

        animal.printInformation();

    }
}
