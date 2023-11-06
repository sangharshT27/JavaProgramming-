/*4.Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
class and implement the respective methods to calculate the area and perimeter of each shape.*/
package javaAssignment;


abstract class GeometricShape {
    abstract double area();

    abstract double perimeter();
}


class Triangle extends GeometricShape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}


class Rectangle extends GeometricShape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 4, 3, 4, 5);
        Rectangle rectangle = new Rectangle(6, 8);

        System.out.println("Triangle - Area: " + triangle.area() + " Perimeter: " + triangle.perimeter());
        System.out.println("Rectangle - Area: " + rectangle.area() + " Perimeter: " + rectangle.perimeter());
    }
}
