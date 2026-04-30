abstract class MotorVehicle {
    String name;
    int number;
    double price;

    MotorVehicle(String n, int num, double p) {
        name = n; number = num; price = p;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String n, int num, double p, double d) {
        super(n, num, p);
        discountRate = d;
    }

    double discount() {
        return price * discountRate / 100;
    }

    void display() {
        System.out.println(name + " " + number + " Price:" + price);
        System.out.println("Discount:" + discount());
    }
}

public class MV {
    public static void main(String[] args) {
        Car c = new Car("Honda",101,1000000,10);
        c.display();
    }
}