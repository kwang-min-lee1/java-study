package javadoc;

/**
 * 학생을 나타내는 클래스
 */
public class Student extends Human{

    /**
     * 학교이름
     */
    String schoolName;

    /**
     * 사람의 이름과 학교 이름을 추가로 인자로 받는 생성자
     * @param name 이름
     * @param age  나이
     * @param schoolName 학교이름
     */
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    /**
     * {@inheritDoc} 학교 정보도 추가하여 소개합니다.
     *
     */
    @Override
    public void intro() {
        super.intro();
        System.out.printf("%s 학생입니다.\n",schoolName);
    }

    /**
     * 주어진 시간에 대한 과목 반환 메서드
     * @param period 교과목 시간입니다. (1,2,3 교시)
     * @return 교과목을 반환
     * @throws ArrayIndexOutOfBoundsException 주어진 시간이 1-3이 아니면 예외 발생
     */
    public String getClassFormPeriod(int period) throws
            ArrayIndexOutOfBoundsException {
        return new String[] {"국어", "영어", "수학"}[period-1];
        //  메서드는 문자열 배열을 새로 생성하고, 이 배열의 특정 인덱스에 접근하여 해당 값을 반환
        // new String[] {"국어", "영어", "수학"}: 새로운 문자열 배열이 생성되며, 각 요소는 "국어", "영어", "수학"으로 초기화
        // [period-1]: 배열에서 접근할 인덱스를 결정, period 는 1부터 시작하는 것으로 가정되며,
        // 배열 인덱스는 0부터 시작하므로 period-1을 사용하여 배열의 인덱스와 맞춘다.
    }
}
