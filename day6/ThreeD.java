import java.util.*;

abstract class ThreeDObject {
    abstract double volume();
    abstract double surfaceArea();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l; this.b = b; this.h = h;
    }

    double volume() {
        return l * b * h;
    }

    double surfaceArea() {
        return 2 * (l*b + b*h + h*l);
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) { this.a = a; }

    double volume() {
        return a*a*a;
    }

    double surfaceArea() {
        return 6 * a * a;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r; this.h = h;
    }

    double volume() {
        return Math.PI * r*r * h;
    }

    double surfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r; this.h = h;
    }

    double volume() {
        return (1.0/3) * Math.PI * r*r * h;
    }

    double surfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }
}

public class ThreeD {
    public static void main(String[] args) {
        ThreeDObject obj;

        obj = new Box(2,3,4);
        System.out.println(obj.volume() + " " + obj.surfaceArea());

        obj = new Cube(3);
        System.out.println(obj.volume() + " " + obj.surfaceArea());

        obj = new Cylinder(2,5);
        System.out.println(obj.volume() + " " + obj.surfaceArea());

        obj = new Cone(2,5);
        System.out.println(obj.volume() + " " + obj.surfaceArea());
    }
}