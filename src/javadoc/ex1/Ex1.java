package javadoc.ex1;


import math.MathArrayUtil;
import math.MathUtility;

/*
연습문제 1. Java 수학 라이브러리 빌드하기

 작성한 수학 유틸리티 클래스 2개를 빌드하고 패키징하여 외부에서 사용할 수 있게 만들어주세요.
	- static0.ex.MathyUtil
	- static0.ex.MathArrayUtil

1. 새로운 프로젝트를 생성하세요. (MathLib)
2. 위의 소스파일을 해당 프로젝트에 준비하세요.
3. JavaDoc 으로 해당 클래스에 대한 설명을 태그와 함께 작성해보세요.
4. javadoc 을 사용해 API 문서를 만들어주세요.
5. 빌드 단계를 거쳐 JAR 파일 아티팩트를 생성해보세요.
6. 다른 프로젝트에서 수학유틸리티 라이브러리 클래스를 불러와 사용해보세요.
 */
public class Ex1  {

    public static void main(String[] args) {

        // MathUtility 사용
        int a = MathUtility.sum(3,7);
        System.out.println(a);

        int b = MathUtility.max(100,200);
        System.out.println(b);

        int c = MathUtility.min(100,200);
        System.out.println(c);

        int d = MathUtility.factorial(5);
        System.out.println(d);

        // MathArrayUtil 사용
        int[] e = {1,2,3,4,5,6};
        int sum = MathArrayUtil.sum(e);
        System.out.println(sum);

        int max = MathArrayUtil.max(e);
        System.out.println(max);

        int min = MathArrayUtil.min(e);
        System.out.println(min);

        double average = MathArrayUtil.average(e);
        System.out.println(average);


    }


}


