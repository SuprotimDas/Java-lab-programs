import java.util.*;

class Tender {
    double cost;
    String name;

    void getData(String n, double c) {
        name = n;
        cost = c;
    }
}

public class Tender2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.print("Enter company name and cost: ");
            String name = sc.next();
            double cost = sc.nextDouble();
            t[i].getData(name, cost);
        }

        double min = t[0].cost;
        String company = t[0].name;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                company = t[i].name;
            }
        }

        System.out.println("Lowest cost company: " + company);
    }
}