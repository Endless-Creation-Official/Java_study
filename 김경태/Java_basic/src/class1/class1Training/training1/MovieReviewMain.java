package class1.class1Training.training1;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        MovieReview[] reviews = new MovieReview[] {review1, review2};

        review1.title = "인셉션";
        review1.review = "인생은 무한 루프";

        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화";


        for(MovieReview m : reviews) System.out.println("영화 제목: " + m.title + " 영화 리뷰: " + m.review);
    }
}
