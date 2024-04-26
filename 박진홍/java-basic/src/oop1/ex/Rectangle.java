package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    int area() {
        return width*height;
    }

    int perimeter() {
        return 2*(width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
