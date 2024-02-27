package polymorphism.ex.ex4;

public class Main {

    /*
    문제4. 쿠키 캐릭터 시스템

쿠키 게임의 캐릭터들을 객체 지향 프로그래밍 방식으로 설계하고 구현하는 것이 목표입니다.
이 시스템에서는 상속을 활용하여 여러 종류의 쿠키 캐릭터들(예: 진저브레드 맨, 스트로베리 쿠키, 초코 쿠키)을
 모델링해야 하며, 각 캐릭터는 특정한 능력(달리기, 점프하기)을 가지고 있어야 합니다.

요구사항:
Cookie라는 추상 클래스를 만듭니다. 이 클래스는 run()과 jump()라는 메서드를 포함해야 하며, 이 메서드들은 캐릭터의 기본 동작을 정의합니다.
Gingerbread, StrawberryCookie, ChocoCookie 클래스를 만들고, 이들 각각이 Cookie 클래스를 상속받도록 합니다. 각 클래스는 run()과 jump() 메서드를 자신의 캐릭터 스타일에 맞게 구현해야 합니다. 또한, 각 캐릭터는 고유의 특수 능력을 하나씩 가질 수 있습니다(예: specialSkill() 메서드).
캐릭터 객체를 생성하고, 그 객체들을 이용해 기본 동작과 특수 능력을 실행해봅니다.


출력 예시:
Gingerbread의 run() 메서드는 "진저브레드 맨이 달립니다!"를 출력합니다.
StrawberryCookie의 jump() 메서드는 "스트로베리 쿠키가 높이 점프합니다!"를 출력합니다.
ChocoCookie의 specialSkill() 메서드는 "초코 쿠키가 초콜릿 폭발을 일으킵니다!"를 출력합니다.

===
진저브레드 맨이 달립니다!
진저브레드 맨이 작게 점프합니다!
스트로베리 쿠키가 달립니다!
스트로베리 쿠키가 높이 점프합니다!
스트로베리 쿠키가 베리 베리 보호막을 생성합니다!
초코 쿠키가 달립니다!
초코 쿠키가 중간 높이로 점프합니다!
초코 쿠키가 초콜릿 폭발을 일으킵니다!
===
     */
    public static void main(String[] args) {
        Cookie gingerBread = new GingerBread();
        Cookie chocoCookie = new ChocoCookie();
        Cookie strawberryCookie = new StrawberryCookie();

        Cookie[] cookies = {gingerBread, chocoCookie, strawberryCookie};

        for (Cookie cookie : cookies) {
            cookie.run();
            cookie.jump();
            // instanceof 연산자를 통한 타입 체크
            if (cookie instanceof GingerBread) {
            } else {
                cookie.specialSkill();
            }
        }
    }

}
