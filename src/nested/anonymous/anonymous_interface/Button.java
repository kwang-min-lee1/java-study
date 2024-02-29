package nested.anonymous.anonymous_interface;

public class Button {
    // 중첩 인터페이스
    static interface OnClickListener {
        void onClick();
    }

    // 필드
    OnClickListener onclickListener;

    // 필드 설정자: 매개변수로 인터페이스 구현 객체를 입력받음
    public void setOnclickListener(OnClickListener onclickListener) {
        this.onclickListener = onclickListener;
    }
    void touch() {
        onclickListener.onClick();
    }
}
