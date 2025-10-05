// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void calculateArea();

    // Concrete method
    void display() {
        System.out.println("Displaying shape area...");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding calculateArea()
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding calculateArea()
    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Creating Circle object
        Shape circle = new Circle(5);
        circle.display();
        circle.calculateArea();

        System.out.println();

        // Creating Rectangle object
        Shape rectangle = new Rectangle(4, 6);
        rectangle.display();
        rectangle.calculateArea();
    }
}
