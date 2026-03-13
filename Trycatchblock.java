import java.util.Scanner;

public class Trycatchblock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Arithmetic Exception
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Division Result: " + result);

            // ArrayIndexOutOfBounds Exception
            int[] arr = {10, 20, 30};
            System.out.print("Enter array index: ");
            int index = sc.nextInt();
            System.out.println("Value at index: " + arr[index]);

            // NumberFormatException
            System.out.print("Enter a number string: ");
            String str = sc.next();
            int parsed = Integer.parseInt(str);
            System.out.println("Parsed Number: " + parsed);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}
