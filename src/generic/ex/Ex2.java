package generic.ex;

public class Ex2 {
      /*
    연습 문제: 제네릭 메서드를 이용한 요소 검색
    문제 설명:
    어떤 배열에서 주어진 요소가 몇 번째 위치에 있는지를 찾는 제네릭 메서드 findIndex 를 구현합니다.
    이 메서드는 배열과 찾고자 하는 요소를 매개변수로 받고,
    요소가 배열 내에 있으면 해당 요소의 인덱스를, 없으면 -1을 반환해야 합니다.

    요구 사항:
    메서드 시그니처 정의: findIndex 메서드는 제네릭 타입 T의 배열 T[]와 검색할 요소 T를 매개변수로 받습니다. 리턴 타입은 int 입니다.
    배열 내 요소 검색: 주어진 요소가 배열 내에 존재하는지 검색하고, 있으면 해당 인덱스를, 없으면 -1을 반환합니다.
    제네릭 메서드 구현: findIndex 메서드는 제네릭 타입을 사용하여 어떤 타입의 배열에 대해서도 작동해야 합니다.

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] stringArray = {"hello", "world", "generic", "method"};

            int intIndex = findIndex(intArray, 3);
            System.out.println("intArray 에서 3의 인덱스: " + intIndex);

            int stringIndex = findIndex(stringArray, "generic");
            System.out.println("stringArray 에서 generic 의 인덱스: " + stringIndex);
        }

    예상 출력 결과
    ===
    intArray 에서 3의 인덱스: 2
    stringArray 에서 "generic"의 인덱스: 2
     */

    public static void main(String[] args) {
        // Integer 와 String 타입의 배열을 생성하고, 초기화합니다.
        // 각각에는 정수나 문자열이 저장되어 있습니다.
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"hello", "world", "generic", "method"};

        // findIndex 메서드를 호출하여 정수 배열에서 숫자 3의 인덱스를 찾습니다.
        // 그리고 결과를 intIndex 변수에 저장하고 출력합니다.
        int intIndex = findIndex(intArray, 3);
        System.out.println("intArray 에서 3의 인덱스: " + intIndex);

        // 제네릭 메서드인 findIndex를 정의합니다.
        // 이 메서드는 배열과 찾고자 하는 요소를 매개변수로 받습니다.
        // 제네릭 타입 T는 어떤 타입의 배열에도 작동할 수 있도록 합니다.
        // 메서드의 반환 타입은 int입니다.
        int stringIndex = findIndex(stringArray, "generic");
        System.out.println("stringArray 에서 generic 의 인덱스: " + stringIndex);
    }

    // 제네릭 메서드인 findIndex 를 정의.
    // 이 메서드는 배열과 찾고자 하는 요소를 매개변수로 받습니다.
    // 제네릭 타입 T는 어떤 타입의 배열에도 작동할 수 있도록 합니다. 메서드의 반환 타입은 int
    public static <T> int findIndex(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            // 배열의 현재 요소와 찾고자 하는 요소를 비교.
            // equals 메서드는 두 객체가 같은지 비교, 요소가 발견되면 true 를 반환
            if (array[i].equals(element)) {
                return i;  // 요소가 발견된 경우, 현재의 인덱스 값을 반환, 이것은 찾고자 하는 요소의 위치를 나타냄
            }
        }
        return -1; // 요소를 찾지 못한 경우, -1을 반환, 이는 요소가 배열 내에 존재하지 않음을 나타냄.
    }

}
