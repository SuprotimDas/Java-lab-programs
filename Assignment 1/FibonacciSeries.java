public class FibonacciSeries {
    private int terms;

    // Constructor
    public FibonacciSeries(int t) {
        this.terms = t;
    }

    // Member function to print Fibonacci series
    public void printFibonacci() {
        int first = 0, second = 1;
        System.out.println("Fibonacci Series for " + terms + " terms:");
        
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        FibonacciSeries fs1 = new FibonacciSeries(10);
        fs1.printFibonacci();

        FibonacciSeries fs2 = new FibonacciSeries(15);
        fs2.printFibonacci();

        FibonacciSeries fs3 = new FibonacciSeries(5);
        fs3.printFibonacci();
    }
}