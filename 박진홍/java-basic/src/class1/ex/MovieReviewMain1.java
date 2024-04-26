package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        for (MovieReview r : reviews) {
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }
    }
}
