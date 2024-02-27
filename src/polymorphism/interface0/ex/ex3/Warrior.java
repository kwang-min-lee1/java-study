package polymorphism.interface0.ex.ex3;

public class Warrior extends Character implements Attackable{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.println(name + "이(가) "+ character.name +"을(를) 공격합니다. 강한 공격!");
    }
}
