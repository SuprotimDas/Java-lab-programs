public class Point {
    int x, y;
}

public class Circle {
    Point p = new Point();
    double radius;

    void display() {
        double area = 3.14 * radius * radius;

        System.out.println("Center: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.p.x = 3;
        c.p.y = 4;
        c.radius = 5;

        c.display();
    }
}