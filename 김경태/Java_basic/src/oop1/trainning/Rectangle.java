package oop1.trainning;

public class Rectangle {
    int width = 0;
    int height = 0;
    int area = 0;

    int calculatePerimeter() {
        return 2 * (width  + height);
    }

    int calculateArea() {
        return width * height;
    }

    boolean isSquare() {
        return width == height;
    }
}
