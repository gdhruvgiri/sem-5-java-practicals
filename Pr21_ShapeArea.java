abstract class Shape {
    float num1, num2;

    abstract void area();
}

class Triangle extends Shape {

    Triangle(float height, float base) {
        num1 = height;
        num2 = base;
    }

    void area() {
        System.out.println("Area of triangle " + ((num1 * num2) / 2));
    }
}

class Rectangle extends Shape {

    Rectangle(float Width, float Length) {
        num1 = Width;
        num2 = Length;
    }

    void area() {
        System.out.println("Area of Rectangle " + (num1 * num2));
    }
}

class Circle extends Shape {

    Circle(float radius) {
        num1 = radius;
    }

    void area() {
        System.out.println("Area of Circle " + (3.14 * (num1 * num1)));
    }
}

public class Pr21_ShapeArea {
    public static void main(String[] args) {
        new Triangle(5, 9).area();
        new Rectangle(5, 9).area();
        new Circle(5).area();
    }
}
