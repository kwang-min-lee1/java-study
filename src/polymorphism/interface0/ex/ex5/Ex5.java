package polymorphism.interface0.ex.ex5;

public class Ex5 {
    /*
    문제5.  스타크래프트 유닛 및 건물 관리 시스템

    요구사항:
    스타크래프트 게임의 간단한 유닛 및 건물 관리 시스템을 자바로 구현합니다.
    여러 유닛과 건물 중 일부는 공격할 수 있고(Attackable),
    일부는 이동할 수 있으며(Movable), 일부는 특정 기능만 수행할 수 있습니다.
    다음 인터페이스와 클래스를 사용하여 시스템을 구현하세요.

    인터페이스 정의:
    Attackable: void attack() 메소드를 포함합니다. 공격 가능한 유닛이 이 인터페이스를 구현합니다.
    Movable: void move() 메소드를 포함합니다. 이동 가능한 유닛이 이 인터페이스를 구현합니다.

    유닛 및 건물 클래스:
    Marine: 공격과 이동이 가능합니다.
    SiegeTank: 공격만 가능합니다.
    Observer: 이동만 가능합니다.
    SupplyDepot: 공격도 이동도 불가능하지만, 공급(supply)을 제공하는 기능(void provideSupply())이 있습니다.

    시스템 구현:
    각 유닛 및 건물의 특성에 맞게 인터페이스를 구현합니다.
    유닛과 건물이 할 수 있는 행동을 콘솔에 출력합니다.

    메인메서드:
    public class Starcraft {
        public static void main(String[] args) {
            Attackable[] attackUnits = {new Marine(), new SiegeTank()};
            Movable[] moveUnits = {new Marine(), new Observer()};

            for (Attackable unit : attackUnits) {
                unit.attack();
            }

            for (Movable unit : moveUnits) {
                unit.move();
            }

            // SupplyDepot는 Attackable이나 Movable 인터페이스를 구현하지 않았으므로,
            // 공격이나 이동 메서드를 호출할 수 없습니다.
            SupplyDepot depot = new SupplyDepot();
            depot.provideSupply(); // 공급 기능만 수행
        }
    }

    출력 예시
    ===
    마린이 총을 쏩니다.
    마린이 이동합니다.
    시즈탱크가 포를 쏩니다.
    옵저버가 떠다닙니다.
    서플라이 디폿이 지원을 제공합니다.
     */
}
