package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this(" ", " ",0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.page = page;
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
