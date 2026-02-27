public class GradingSystem {
    private double percentage;

    // Constructor
    public GradingSystem(double per) {
        this.percentage = per;
    }

    // Member function to find grade
    public void findGrade() {
        if (percentage >= 90) {
            System.out.println("Percentage: " + percentage + "% - Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Percentage: " + percentage + "% - Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Percentage: " + percentage + "% - Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Percentage: " + percentage + "% - Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Percentage: " + percentage + "% - Grade: E");
        } else {
            System.out.println("Percentage: " + percentage + "% - Grade: F");
        }
    }

    // Main method
    public static void main(String[] args) {
        GradingSystem gs1 = new GradingSystem(95);
        gs1.findGrade();

        GradingSystem gs2 = new GradingSystem(85);
        gs2.findGrade();

        GradingSystem gs3 = new GradingSystem(75);
        gs3.findGrade();

        GradingSystem gs4 = new GradingSystem(65);
        gs4.findGrade();

        GradingSystem gs5 = new GradingSystem(50);
        gs5.findGrade();

        GradingSystem gs6 = new GradingSystem(35);
        gs6.findGrade();
    }
}