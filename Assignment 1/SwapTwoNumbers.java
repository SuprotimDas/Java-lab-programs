public class SwapTwoNumbers {
    private int num1, num2;

    // Constructor
    public SwapTwoNumbers(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    // Member function to swap two numbers
    public void swap() {
        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    }

    // Main method
    public static void main(String[] args) {
        SwapTwoNumbers obj1 = new SwapTwoNumbers(10, 20);
        obj1.swap();

        System.out.println();

        SwapTwoNumbers obj2 = new SwapTwoNumbers(100, 200);
        obj2.swap();
    }
}