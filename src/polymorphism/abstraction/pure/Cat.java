package polymorphism.abstraction.pure;

import access_modifier.first.A;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 슬금슬금 움직입니다.");

    }
}
