interface Gross {
    void calc();
}

class Employee {
    String name = "Amit";
}

class Salary extends Employee implements Gross {
    double basic = 10000, hra = 2000, da = 1000;

    public void calc() {
        double gross = basic + hra + da;
        System.out.println("Gross: " + gross);
    }
}

public class Gross {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.calc();
    }
}