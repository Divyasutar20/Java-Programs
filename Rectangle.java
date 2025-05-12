class Rectangle {
    int width = 5, height = 3;

    void area() {
        System.out.println("Area: " + (width * height));
    }

    void perimeter() {
        System.out.println("Perimeter: " + (2 * (width + height)));
    }
}

public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.area();
    r.perimeter();
}
