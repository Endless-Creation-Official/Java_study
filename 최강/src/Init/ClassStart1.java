package Init;

class MovieReview {
    String title;
    String review;
}

public class ClassStart1 {

    public static void main(String[] args) {



        MovieReview movie1=new MovieReview();
        movie1.title="인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2=new MovieReview();
        movie2.title="어바웃 타임";
        movie2.review = "인생 시간 영화";

        MovieReview[] movies = {movie1, movie2}; // MovieReview 또한 int와 같은 특정타입이기 때문에 배열을 사용해 하나의 데이터 구조로 만들어줄 수 있음

        for (MovieReview x : movies) {
            System.out.println("영화 제목: " + x.title + "리뷰:");
        }
    }
}
