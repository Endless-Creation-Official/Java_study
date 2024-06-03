package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movie1 = new MovieReview("인셉션", 5);
        MovieReview movie2 = new MovieReview("어바웃 타입", 4.5);

        MovieReview[] movies = {movie1, movie2};
        for (MovieReview movie : movies) {
            System.out.println("영화제목은 " + movie.name + " 영화평점은 " + movie.review);
        }

        MovieReview[] movies1 = {new MovieReview("인셉션", 5), new MovieReview("어바웃타입", 4.5)};
        for (MovieReview movieReview : movies1) {
            String name = movieReview.name;
            double review = movieReview.review;
            System.out.println("영화제목은 " + name + " 영화평점은 " + review);
        }

    }
}
