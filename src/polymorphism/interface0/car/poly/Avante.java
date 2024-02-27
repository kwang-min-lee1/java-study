package polymorphism.interface0.car.poly;

// Car 역할을 구현한 구현 클래스 (상세사항, Detail)
public class Avante implements Car {
    public void onEngine()
    {
        System.out.println("아반떼 엔진을 킵니다.");
    }
    public void offEngine(){
        System.out.println("아반떼 엔진을 끕니다.");
    }
    public void pressAccel(){
        System.out.println("아반떼 엑셀을 밟습니다.");
    }
    public void pressBreak(){
        System.out.println("아반떼 브레이크를 밟습니다.");
    }
}
