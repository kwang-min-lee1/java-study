package inheritance;

public class ElectricCar extends Car {

    ElectricCar() {
        //System.out.println("ElectricCar의 생성자 호출");
    }
    // 부모 요소를 덮어쓸 때 @override 라틑 특별한 주석을 붙인다.
    // 컴파일러는 메서드가 정확하게 오버라이딩 되었는지 확인을 한다.
    // overriding : 메서드 재정의
    @Override
    public void move() {
        System.out.println("전기차가 조용하게 이동합니다.");
    }

    public void charge(){
        System.out.println("전기차 배터리를 충전합니다.");
    }


}
