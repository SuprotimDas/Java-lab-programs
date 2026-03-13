public class numformatexp {
    public static void main(String[] args) {
        try {
            String str = "abc"; // invalid number
            int num = Integer.parseInt(str);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } finally {
            System.out.println("Parsing attempt completed.");
        }
    }
}
