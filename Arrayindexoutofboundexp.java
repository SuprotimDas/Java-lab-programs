public class Arrayindexoutofboundexp  {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } finally {
            System.out.println("Array operation finished.");
        }
    }
}
