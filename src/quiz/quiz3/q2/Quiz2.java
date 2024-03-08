package quiz.quiz3.q2;

/*
사용자 정의 이벤트 리스너 구현하기


    버튼 클릭 이벤트를 처리하는 가상의 익명 객체를 만드세요.

    요구사항:
    Button 클래스는 OnClickListener 타입의 필드를 가지고 있어야 합니다.
    이 리스너는 버튼이 클릭됐을 때 호출될 콜백을 정의합니다.
    setOnClickListener(OnClickListener listener) 메소드를 통해 외부에서 리스너를 등록할 수 있게 해야 합니다.
    click() 메소드는 버튼이 클릭되었을 때 호출되며, 이 메소드 내에서 리스너가
    null이 아니라면 리스너의 onClick() 메소드를 호출합니다.

    OnClickListener 인터페이스
    OnClickListener 인터페이스는 void onClick() 메소드를 정의해야 합니다.

    메인 메소드에서 Button 객체를 생성하고, 익명 클래스를 사용하여 OnClickListener를 구현한 다음, 버튼 클릭 이벤트가 발생했을 아래와 같은 메시지가 출력되게 구현하세요.

    실행결과
    ===
    버튼이 클릭되었습니다.
 */

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


