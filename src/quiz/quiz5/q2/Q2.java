package quiz.quiz5.q2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
로또 번호 생성기

    Set 인터페이스와 Random 객체를 활용하여
    1부터 45까지의 숫자 중에서 6개의 숫자를 추출합니다.
    HashSet 을 활용하여 중복되지 않는 로또 번호 6개를 무작위로 생성하는 간단한 번호 생성기를 구현합니다.

    요구 사항
    - 1부터 45까지의 숫자 중에서 무작위로 6개의 숫자를 선택합니다.
    - 선택된 숫자는 중복되면 안 됩니다.
    - 6개의 숫자를 모두 선택한 후, 선택된 숫자들을 출력합니다.

    출력 예시
    ===
    로또 번호: [5, 12, 23, 25, 33, 42]
 */
public class Q2 {

    public static void main(String[] args) {

        // generateLottoNumbers 메서드를 호출하여 중복되지 않는 로또 번호 6개를 생성하고,
        // 이를 lottoNumbers 변수에 할당
        Set<Integer> lottoNumbers = generateLottoNumbers();
        // 생성된 로또 번호를 출력
        System.out.println("로또 번호: " + lottoNumbers);
    }


    // 중복되지 않는 로또 번호 6개를 생성하는 generateLottoNumbers 메서드를 정의
    public static Set<Integer> generateLottoNumbers() {

        // 중복되지 않는 숫자들을 저장하기 위한 HashSet 을 생성
        Set<Integer> lottoNumbers = new HashSet<>();
        // 난수를 생성하기 위한 Random 객체를 생성
        Random random = new Random();

        // 로또 번호가 6개가 될 때까지 반복
        while (lottoNumbers.size() < 6) {
            // 1부터 45까지의 난수를 생성
            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 숫자를 무작위로 선택
            // 생성된 난수를 HashSet 에 추가합니다.
            // HashSet 의 특성상 중복된 숫자는 자동으로 제거
            lottoNumbers.add(randomNumber); // 중복되지 않는 숫자일 경우에만 추가
        }
        // 생성된 로또 번호를 반환
        return lottoNumbers;
    }
}
