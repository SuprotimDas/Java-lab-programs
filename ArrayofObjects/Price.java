import java.util.*;

class Item {
    int code;
    double price;

    void getData(int c, double p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] arr = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = new Item();
            System.out.print("Enter code and price: ");
            int c = sc.nextInt();
            double p = sc.nextDouble();
            arr[i].getData(c, p);
            total += p;
        }

        System.out.println("Code\tPrice");
        for (int i = 0; i < 5; i++) {
            arr[i].display();
        }

        System.out.println("Total Price: " + total);
    }
}