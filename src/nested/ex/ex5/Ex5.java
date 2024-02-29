package nested.ex.ex5;

public class Ex5 {
    /*
    문제 5.

다음 메인 메소드의 실행결과를 출력하는 Worker 클래스와 Anonymous 클래스를 익명 자식 객체를 이용하여 만들어주세요.
public class Main {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.start();
		//익명 객체 로컬변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
			new Worker() {
				@Override
				public void start() {
					System.out.println("테스트를 합니다.");
				}
			}
		);
	}
}

출력예시
=====
디자인을 합니다.
개발을 합니다.
테스트를 합니다.

     */
}
