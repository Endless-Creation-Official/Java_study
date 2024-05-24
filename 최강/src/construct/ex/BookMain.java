package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 사용해서 만들어주기
        // 자바가 기본적으로 기본 생성자를 만들어주기는 하지만 다른 생성자를 따로
        // 만드는 시점부터 기본 생성자는 호출자가 직접 만들어줘야 함
        Book book1 = new Book();
        book1.displayInfo();

        // title 과 author만을 매개변수로 받는 생성자
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();
        // 3개전부 매개변수로 받는 생성자
        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
        book3.displayInfo();

    }
}
