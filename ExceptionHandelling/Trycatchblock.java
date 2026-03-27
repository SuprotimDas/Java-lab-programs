import java.util.Scanner;

public class Trycatchblock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int result = sc.nextInt() / sc.nextInt();
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed.");
        } 
        finally {
            System.out.println("Program finished.");
            sc.close();
        }
    }
}