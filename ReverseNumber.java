public class ReverseNumber {
    private int number;

    // Constructor
    public ReverseNumber(int num) {
        this.number = num;
    }

    // Member function to reverse a number
    public void reverseNumber() {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
    }

    // Main method
    public static void main(String[] args) {
        ReverseNumber rn1 = new ReverseNumber(12345);
        rn1.reverseNumber();

        System.out.println();

        ReverseNumber rn2 = new ReverseNumber(9876);
        rn2.reverseNumber();

        System.out.println();

        ReverseNumber rn3 = new ReverseNumber(100);
        rn3.reverseNumber();
    }
}