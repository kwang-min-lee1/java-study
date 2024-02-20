package access_modifier.first;

public class MainInner {
    public static void main(String[] args) {
        Data data = new Data();


        // 외부 + 같은 패키지 접근시 private 접근 불가
        data.publicData =1000;
        data.defaultData = 1000;
        //data.privateData  같은 패키지 메인 접근 불가

        data.publicMethod();
        data.defaultMethod();
       // data.privateMethod();
    }
}
