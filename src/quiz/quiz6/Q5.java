package quiz.quiz6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
제품 리뷰 분석

    온라인 상점에서 판매되는 여러 제품에 대한 리뷰 점수가 있습니다.
    각 리뷰에는 제품 ID와 리뷰 점수(1~5)가 포함되어 있습니다.
    여러분의 목표는 다음 정보를 계산하는 것입니다:

    요구사항:
    - 전체 제품에 대한 평균 리뷰 점수를 계산하세요.
    - 리뷰 점수가 5점인 리뷰의 수를 계산하세요.

    List<ProductReview> reviews = Arrays.asList(
        new ProductReview("product1", 5),
        new ProductReview("product2", 4),
        new ProductReview("product3", 5),
        new ProductReview("product4", 3),
        new ProductReview("product1", 4)
    );

    출력예시
    ===
    평균 리뷰 점수: 4.2
    5점 리뷰 수: 2
 */
public class Q5 {

    static class ProductReview {
        String productName;
        int reviewScore;

        public ProductReview(String productName, int reviewScore) {
            this.productName = productName;
            this.reviewScore = reviewScore;
        }
    }
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        // 전체 제품에 대한 평균 리뷰 점수를 계산
       double averageReviewScore = reviews.stream()
               .mapToInt(productReview -> productReview.reviewScore) // 리뷰 점수로 매핑
               .average() // 평균 계산
               .orElse(0.0);  // 평균이 없는 경우 0을 반환

        System.out.println("평균 리뷰 점수: " + averageReviewScore);

        // 리뷰 점수가 5점인 리뷰의 수를 계산
        long fiveReview = reviews.stream()
                .filter(productReview -> productReview.reviewScore == 5) // 5점 리뷰 필터링
                .count(); // 개수 계산

        System.out.println("5점 리뷰 수: " + fiveReview);

    }
}
