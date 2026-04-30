// Interface
interface Gross {
    void calculateGross();
}

// Base class
class Employee {
    int id;
    String name;

    void getData(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Derived class
class Salary extends Employee implements Gross {
    double basic = 10000, hra = 2000, da = 1000, gross;

    public void calculateGross() {
        gross = basic + hra + da;
        System.out.println("Gross Salary: " + gross);
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.getData(1, "Rahul");
        s.display();
        s.calculateGross();
    }
}