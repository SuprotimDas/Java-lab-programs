class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    double radius;
    Point p;

    Circle(double r, int x, int y) {
        radius = r;
        p = new Point(x, y);
    }

    void display() {
        System.out.println("Center: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

public class Main3 {
    public static void main(String[] args) {
        Circle c = new Circle(5, 2, 3);
        c.display();
    }
}