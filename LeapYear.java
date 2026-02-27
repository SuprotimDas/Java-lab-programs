public class LeapYear {
    private int year;

    // Constructor
    public LeapYear(int y) {
        this.year = y;
    }

    // Member function to check if year is leap year
    public void checkLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    // Main method
    public static void main(String[] args) {
        LeapYear ly1 = new LeapYear(2024);
        ly1.checkLeapYear();

        LeapYear ly2 = new LeapYear(2023);
        ly2.checkLeapYear();

        LeapYear ly3 = new LeapYear(2000);
        ly3.checkLeapYear();

        LeapYear ly4 = new LeapYear(1900);
        ly4.checkLeapYear();
    }
}