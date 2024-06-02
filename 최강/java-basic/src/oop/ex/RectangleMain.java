package oop.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height=8;
        rectangle.width=5;

        int area=rectangle.calculateArea();
        int perimeter= rectangle.calculatePerimeter();
        boolean square =rectangle.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + square);
    }
}
