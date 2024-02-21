package static0;

public class Static2 {
    public static void main(String[] args) {

   /*
        // 일반적인 방법으로 필드에 갯수 정보가 생성될때마다 공유되지 않는다.
        Obj 객체1 = new Obj("객체1");
        System.out.println(객체1.count);   // 1
        Obj 객체2 = new Obj("객체2");
        System.out.println(객체2.count);   // 2 => 1
        Obj 객체3 = new Obj("객체3");
        System.out.println(객체3.count);   // 3 => 1
        */

        // 외부에서 생성될 때마다 카운터 객체를 주입하여 개수를 센다.
/*        Counter counter = new Counter();
        Obj 객체1 = new Obj("객체1", counter);
        System.out.println(counter.count);   // 1
        Obj 객체2 = new Obj("객체2", counter);
        System.out.println(counter.count);   // 2 => 1
        Obj 객체3 = new Obj("객체3", counter);
        System.out.println(counter.count);   // 3 => 1*/

        // static 키워드를 적용하게 될 경우 메서드 영역에서 변수 정보를 공유한다.
        Obj 객체1 = new Obj("객체1");
        System.out.println(객체1.count);   // 1
        Obj 객체2 = new Obj("객체2");
        System.out.println(객체2.count);   // 2
        Obj 객체3 = new Obj("객체3");
        System.out.println(객체3.count);   // 3

        //static 변수(=클래스 변수)는 클래스를 통해 접근 가능하다.
        System.out.println("객체의 갯수:" + Obj.count);


    }
}
