package generic.wildcard;

public class Unit {
}

class Knight extends Unit {}

class HolyKnight extends Knight {}

class Horse<T extends Unit> {
    private T rider;

    public void setRider(T rider) {
        this.rider = rider;
    }
}
