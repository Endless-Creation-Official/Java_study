package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int witdh;
    private int height;

    public Rectangle(int witdh, int height) {
        this.witdh = witdh;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "witdh=" + witdh +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return witdh == rectangle.witdh && height == rectangle.height;
    }

}
