package lambda.ex.ex5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 연습문제: 파티 참석자 명단 관리

 요구사항:
 친구들과의 파티를 위해 참석자 명단을 관리하는 간단한 시스템을 구현합니다.
  각 참석자는 Person 클래스로 표현되며, 참석자의 이름(name)과 나이(age)를 필드로 가집니다.
 몇 가지 조작을 함수형 인터페이스를 사용하여 구현해야 합니다.

 Person 클래스 정의:
 - 필드: 이름(String name), 나이(int age)
 - 생성자: 모든 필드를 초기화하는 생성자
 - 참석자 명단 생성 및 초기화

 - 다음 조건에 맞게 참석자 명단을 처리하는 코드 작성:
   - 모든 참석자의 이름을 환영 메시지와 함께 출력 ("Welcome, [name]!")
   - 참석자 명단에서 특정 조건(예: 나이가 18세 이상)을 만족하는 사람만 초대
   - 초대된 참석자의 이름을 생성하여 리스트로 반환

 조건:
 - Consumer<Person>를 사용하여 각 참석자에 대한 환영 메시지를 출력하세요.
 - Predicate<Person>를 사용하여 특정 조건(예: 나이가 18세 이상)을 만족하는 참석자를 필터링하세요.
 - Function<Person, String>을 사용하여 참석자의 이름을 반환하세요.
 - Supplier<List<String>>를 사용하여 최종 초대 명단을 생성하고 반환하세요.

 입력 데이터:
 List<Person> attendees = Arrays.asList(
     new Person("둘리", 22),
     new Person("희동이", 3),
     new Person("마이콜", 25),
     new Person("영희", 16)
 );

 출력 예시
 ===
 환영 메시지 출력:
 Welcome, 둘리!
 Welcome, 희동이!
 Welcome, 마이콜!
 Welcome, 영희!

 초대된 참석자 명단:
 [둘리, 마이콜]
  */
public class Ex5 {
    public static void main(String[] args) {

            List<Person> attendees = Arrays.asList(
                    new Person("둘리", 22),
                    new Person("희동이", 3),
                    new Person("마이콜", 25),
                    new Person("영희", 16)
            );

            // Consumer<Person>를 사용하여 각 참석자에 대한 환영 메시지를 출력하세요.
            Consumer<Person> welcome = person ->
                    System.out.println("환영합니다, " + person.getName());

            // 리스트의 각 요소에 Consumer.accept() 적용
            attendees.forEach(welcome);

            // - Predicate<Person>를 사용하여 특정 조건(예: 나이가 18세 이상)을 만족하는 참석자를 필터링하세요.
            Predicate<Person> isAdult = person -> person.getAge() >= 18;
            for (Person attendee : attendees) {
                if (isAdult.test(attendee)) {
                    System.out.println(attendee.getName() + " 18세 이상");
                }
            }
//        - Function<Person, String>을 사용하여 참석자의 이름을 반환하세요.
            Function<Person, String> getNameFunction
                    = Person::getName;      // 메서드 참조
            //(person) -> person.getName();

//        - Supplier<List<String>>를 사용하여 최종 초대 명단을 생성하고 반환하세요.
            Supplier<List<String>> inviteListSupplier =
                    ArrayList::new;     // 생성자 참조
            // () -> { return new ArrayList<>(); };
            List<String> inviteList = inviteListSupplier.get();

            // 참석자 명단을 순회하며
            for (Person attendee : attendees) {
                // 18세 이상인 경우만 필터링해서
                if (isAdult.test(attendee)) {
                    // 새로운 초대명단에 이름을 추가할 것
                    inviteList.add(getNameFunction.apply(attendee));
                }
            }

            // 초대명단 출력
            System.out.println(inviteList);

        }

    }

