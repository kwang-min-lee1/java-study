package quiz.quiz2.q4;

public class Healer implements Healable{
    public Healer(String name) {
        super(name);  // 추상 클래스(부모 클래스에서 호출)
    }

    @Override
    public void heal(Character character) {
        System.out.println(name + "은(는) "+ character.getName() +"을(를) 치유합니다. 치유의 빛!");
    }
}
