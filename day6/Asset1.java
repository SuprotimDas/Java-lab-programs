abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    void displayDetails() {
        System.out.println("Stock Asset");
    }
}

class Bond extends Asset {
    void displayDetails() {
        System.out.println("Bond Asset");
    }
}

class Savings extends Asset {
    void displayDetails() {
        System.out.println("Savings Asset");
    }
}

public class Asset1 {
    public static void main(String[] args) {
        Asset a;

        a = new Stock(); a.displayDetails();
        a = new Bond(); a.displayDetails();
        a = new Savings(); a.displayDetails();
    }
}