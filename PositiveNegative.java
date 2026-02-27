public class PositiveNegative {
    private int number;

    // Constructor
    public PositiveNegative(int num) {
        this.number = num;
    }

    // Member function to check if number is positive or negative
    public void checkNumber() {
        if (number > 0) {
            System.out.println(number + " is a Positive number");
        } else if (number < 0) {
            System.out.println(number + " is a Negative number");
        } else {
            System.out.println(number + " is Zero");
        }
    }

    // Main method
    public static void main(String[] args) {
        PositiveNegative pn1 = new PositiveNegative(15);
        pn1.checkNumber();

        PositiveNegative pn2 = new PositiveNegative(-10);
        pn2.checkNumber();

        PositiveNegative pn3 = new PositiveNegative(0);
        pn3.checkNumber();
    }
}