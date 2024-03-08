package quiz.quiz3.q2;

public class Quiz2 {
    public static void main(String[] args) {
        // Button 객체 생성
        Button button = new Button();

        // OnClickListener를 익명 클래스로 구현하여 등록
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("이벤트가 발생했습니다.");
            }
        });

        // 버튼 클릭 시 클릭 이벤트 발생
        button.click();
    }
}

// Button 클래스 정의
class Button {
    private OnClickListener onClickListener;

    // 외부에서 OnClickListener 등록을 위한 메소드
    public void setOnClickListener(OnClickListener listener) {
        this.onClickListener = listener;
    }

    // 클릭 이벤트 처리 메소드
    public void click() {
        System.out.println("버튼이 클릭되었습니다.");
        if (onClickListener != null) {
            onClickListener.onClick();
        }
    }
}


