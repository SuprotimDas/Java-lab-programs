public class MaximumOfThree {
    private int num1, num2, num3;

    // Constructor
    public MaximumOfThree(int a, int b, int c) {
        this.num1 = a;
        this.num2 = b;
        this.num3 = c;
    }

    // Member function to find maximum of three numbers
    public void findMaximum() {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Maximum of " + num1 + ", " + num2 + ", " + num3 + " is: " + max);
    }

    // Main method
    public static void main(String[] args) {
        MaximumOfThree mot1 = new MaximumOfThree(10, 20, 15);
        mot1.findMaximum();

        MaximumOfThree mot2 = new MaximumOfThree(50, 30, 40);
        mot2.findMaximum();

        MaximumOfThree mot3 = new MaximumOfThree(5, 5, 5);
        mot3.findMaximum();
    }
}