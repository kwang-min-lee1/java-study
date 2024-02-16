package class0.ex;

public class Ex1 {
    public static void main(String[] args) {


        MovieReview movieReview1 = new MovieReview(); // 타입 변수 초기화, 객체 생성, 인스턴스화
        movieReview1.title = "기생충";
        movieReview1.review = "재미있다";

        MovieReview movieReview2 = new MovieReview(); // 타입 변수 초기화, 객체 생성, 인스턴스화
        movieReview2.title = "타이타닉";
        movieReview2.review = "인생영화";

        MovieReview movieReview3 = new MovieReview(); // 타입 변수 초기화, 객체 생성, 인스턴스화
        movieReview3.title = "부산행";
        movieReview3.review = "공포영화";



        MovieReview[] movieReviews = new MovieReview[3];
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;
        movieReviews[2] = movieReview3;


        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + "은 " + movieReview.review);
            }

//        for (int i = 0; i < movieReviews.length; i++) {
//            System.out.println("[ 제목 : " +movieReviews[i].title + ", 리뷰 : " + movieReviews[i].review +  " ]");
//        }
    }
}
