package oop.ex;

public class Rectangle {
    int width;
    int height;
    int calculateArea() {
       return width*height;
    }
    int calculatePerimeter() {
        return 2 * (width+height);
    }
    boolean isSquare() {
        return this.width==this.height;
    }
}
