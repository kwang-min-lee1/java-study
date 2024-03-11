package generic.ex;

public class Ex1 {

    /*
   연습 문제: 제네릭을 활용한 범용 Pair 클래스 구현

   문제 설명:
   두 개의 객체를 한 쌍으로 관리할 수 있는 제네릭 클래스 Pair 를 구현하세요.
   이 클래스는 두 객체의 타입이 서로 다를 수 있도록 제네릭을 활용해야 합니다.
   Pair 클래스는 두 객체에 대해 getter 메소드를 제공해야 하며,
   이 두 객체는 생성 시점에 초기화되어야 합니다.

   요구 사항:
   Pair 클래스 정의: 두 개의 제네릭 타입 매개변수(K와 V)를 갖는 Pair 클래스를 정의합니다.
   생성자 구현: Pair 객체를 생성할 때, 두 객체를 매개변수로 받아 초기화하는 생성자를 구현합니다.
   Getter 메소드 제공: 두 객체 각각에 대한 getter 메소드 getKey()와 getValue()를 구현합니다.


   /main
       public static void main(String[] args) {
           // Integer와 String 타입을 가진 Pair 객체 생성
           Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
           System.out.println("Pair 1: " + pair1.getKey() + " - " + pair1.getValue());

           // String과 Boolean 타입을 가진 Pair 객체 생성
           Pair<String, Boolean> pair2 = new Pair<>("KeyExists", true);
           System.out.println("Pair 2: " + pair2.getKey() + " - " + pair2.getValue());
       }

   출력 예시:
   Pair 1: 1 - Apple
   Pair 2: KeyExists - true

    */

    // main 메소드 안에서는 두 개의 Pair 객체를 생성하고, 이들의 key 와 value 를 출력합니다.
    public static void main(String[] args) {
        // Integer와 String 타입을 가진 Pair 객체 생성
        Pair<Integer,String> pair1 = new Pair<>(1, "Apple");
        System.out.println("pair 1: " + pair1.getKey() + " - " + pair1.getValue());

        // String과 Boolean 타입을 가진 Pair 객체 생성
        Pair<String, Boolean> pair2 = new Pair<>("KeyExists", true);
        System.out.println("Pair 2: " + pair2.getKey() + " - " + pair2.getValue());
    }


    // 1. Pair 클래스를 정의.
    // 이 클래스는 두 개의 제네릭 타입 매개변수 K와 V를 가집니다.
    // 이것은 Pair 객체를 생성할 때 K와 V에 대한 타입을 지정할 수 있게 해줍니다.
    static class Pair<K,V> {

        // Pair 클래스 내부에는 두 개의 변수가 있습니다.
        // 하나는 key 로, 다른 하나는 value 로 사용됩니다.
        // 이 변수들은 Pair 객체가 가지는 두 가지 요소를 나타냅니다.
        K key;
        V value;

        // 2. Pair 클래스의 생성자 정의
        // 이 생성자는 두 개의 매개변수를 받아서 Pair 객체를 초기화합니다.
        // 받은 첫 번째 매개변수는 key 에 할당되고, 두 번째 매개변수는 value 에 할당됩니다.
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }

        // getKey()와 getValue() 메소드는 각각 Pair 객체의 key 와 value 를 반환합니다.
        // 이 메소드들은 Pair 객체의 내부 변수에 직접 접근하지 않고, getter 메소드를 통해 값을 가져옵니다.
        // 이것을 통해 정보 은닉의 개념이 적용되어 객체의 내부 상태를 보호합니다.
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }


}




}
