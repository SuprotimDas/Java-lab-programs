import java.util.Scanner;

class Item {
    int code;
    double price;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item arr[] = new Item[5];
        double total = 0;

        for(int i=0;i<5;i++){
            arr[i] = new Item();
            System.out.print("Enter code: ");
            arr[i].code = sc.nextInt();
            System.out.print("Enter price: ");
            arr[i].price = sc.nextDouble();
            total += arr[i].price;
        }

        System.out.println("Code\tPrice");
        for(int i=0;i<5;i++){
            System.out.println(arr[i].code + "\t" + arr[i].price);
        }

        System.out.println("Total Price = " + total);
    }
}