import java.util.*;

abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }

    abstract void area();
}

class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    Triangle(double b, double h) {
        super(b, h);
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        rect.area();

        System.out.print("Enter base and height of Triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Triangle tri = new Triangle(base, height);
        tri.area();

        sc.close();
    }
}
