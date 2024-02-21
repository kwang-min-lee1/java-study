package access_modifier.ex;

public class MaxCounter {
    // 필드
    private int count;
    private int max;

    // 생성자를 통해 최대값을 초기화
    MaxCounter(int max) {
        this.max = max;
    }
    // 메서드
    //    increment() 숫자를 하나 증가
    public void increment() {
        // 제약사항
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행문
        System.out.println(count);
        count++;
    }
    //    getCount() 지금까지 증가한 값을 반환하는 게터메서드
    public int getCount() {
        return count;
    }
}
