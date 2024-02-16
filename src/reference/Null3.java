package reference;

public class Null3 {
    public static void main(String[] args) {
        DataWrapper dataWrapper = new DataWrapper();
        dataWrapper.data =new Data(); // 인스턴스 내부의 참조필드를 초기화 생성


        // 초기화 하지 않는 필드에 접근 시 초기값이 대입된다.
        System.out.println(dataWrapper.count);  // int : 0
        System.out.println(dataWrapper.data);  // 참조타입(data) : null

        //컴파일러에서 작동하지 않지만, 런타임 단계에서 NPE가 발생
        System.out.println(dataWrapper.data.value1);
        //System.out.println(null.value1);

    }
}

