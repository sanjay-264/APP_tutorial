import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle breadth: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter triangle base: ");
        double base = sc.nextDouble();

        System.out.print("Enter triangle height: ");
        double height = sc.nextDouble();

        Shape s1 = new Circle(radius);
        Shape s2 = new Rectangle(length, breadth);
        Shape s3 = new Triangle(base, height);

        System.out.println("Circle Area : " + s1.calculateArea());
        System.out.println("Rectangle Area : " + s2.calculateArea());
        System.out.println("Triangle Area : " + s3.calculateArea());
    }
}