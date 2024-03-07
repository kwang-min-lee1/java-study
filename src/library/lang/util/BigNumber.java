package library.lang.util;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        // Long 의 최대값, 최소값 범위
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // 범위를 넘어가는 매우 큰 수를 다루기 위한 클래스
        // BigInteger
        // Long longNumber = 192333544546546987486L; // 넘을 수 없음
        BigInteger bigInteger1 = new BigInteger("192132135465413213");
        BigInteger bigInteger2 = new BigInteger("192132135465413200");

        BigInteger sum = bigInteger1.add(bigInteger2);
        System.out.println("큰 수 합계 : " + sum);

        // 뻴샘
        BigInteger sub = bigInteger1.subtract(bigInteger2);
        System.out.println("큰 수 빼기: " + sub);

        // 곱셈
        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        System.out.println("큰 수 곱하기: " + multiply);

        // 나눗셈
        BigInteger divide = bigInteger1.divide(bigInteger2);
        System.out.println("큰 수 나누기: " + divide);  // 정수 : 소수점 없음

        // 거듭제곱
        BigInteger pow = BigInteger.valueOf(2).pow(64);
        System.out.println("2의 64제곱 : " + pow);

        // 최대공약수
        BigInteger gcd = bigInteger1.gcd(bigInteger2);
        System.out.println("최대공약수 :" + gcd);

        // 부동 소수점 정밀도 오류
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        System.out.println("0.7 - 0.3 = " + (0.7 - 0.3));
        System.out.println("0.2 * 0.4 = " + (0.2 * 0.4));
        System.out.println("0.9 / 0.3 = " + (0.9 / 0.3));
        System.out.println("0.9 / 0.3 = " + (0.9f / 0.3));

        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        System.out.println("===================BigDecimal 사용=================");
        System.out.println("0.1 + 0.2 = " + bigDecimal1.add(bigDecimal2));
        System.out.println("0.1 - 0.2 = " + bigDecimal1.subtract(bigDecimal2));

        BigDecimal b1 = new BigDecimal("0.2");
        BigDecimal b2 = new BigDecimal("0.4");
        System.out.println("0.2 * 0.4 = " + b1.multiply(b2));

        // 금융계산이나 과학계산에 필요한 고정밀도 연산




    }
}
