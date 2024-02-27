package polymorphism.interface0.animal2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        // Animal 클래스를 상속받은 클래스만 가능
        sound(cat);
        sound(sparrow);
        sound(penguin);

        // Flyable 인터페이스를 상속받은 클래스만 가능
        fly(sparrow);
        fly(penguin);
        //fly(cat);

    }
     static void sound(Animal animal) {
        animal.sound();
     }
     static  void fly(Flyable flyable) {
        flyable.fly();

     }
}
