import java.util.*;

abstract class Shape {
    abstract void printArea();
    int base, height;
}

class Triangle extends Shape {
    void printArea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base and height");
        base = s.nextInt();
        height = s.nextInt();
        System.out.println("Area of Triangle is: " + (0.5 * base * height));
    }
}

class Rectangle extends Shape {
    void printArea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        base = s.nextInt();
        height = s.nextInt();
        System.out.println("Area of Rectangle is: " + (base * height));
    }
}

class Circle extends Shape {
    void printArea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius");
        base = s.nextInt();
        System.out.println("Area of Circle is: " + (3.141 * base * base));
    }
}

class ShapeDemo {
    public static void main(String ar[]) {
        Triangle t = new Triangle();
        t.printArea();
        Rectangle r = new Rectangle();
        r.printArea();
        Circle c = new Circle();
        c.printArea();
    }
}
