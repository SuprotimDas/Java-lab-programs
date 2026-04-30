import java.util.*;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sen";

    void printDept();
}

class Hostel {
    String hostelName, hostelLocation;
    int rooms;

    void getHostel(String h, String loc, int r) {
        hostelName = h;
        hostelLocation = loc;
        rooms = r;
    }

    void printHostel() {
        System.out.println(hostelName + " " + hostelLocation + " Rooms:" + rooms);
    }
}

class Student extends Hostel implements Department {
    String name, regdNo, subject;
    double avg;

    void getData(String n, String r, String s, double a) {
        name = n;
        regdNo = r;
        subject = s;
        avg = a;
    }

    void printData() {
        System.out.println(name + " " + regdNo + " " + subject + " " + avg);
        printHostel();
        printDept();
    }

    public void printDept() {
        System.out.println("Dept: " + deptName + " Head: " + deptHead);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        int count = 0;

        while (true) {
            System.out.println("1.Admit 2.Migrate 3.Display 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                s[count] = new Student();
                System.out.print("Enter details: ");
                s[count].getData(sc.next(), sc.next(), sc.next(), sc.nextDouble());
                s[count].getHostel("BH1", "Campus", 100);
                count++;
            }

            else if (ch == 2) {
                System.out.print("Enter regdNo: ");
                String r = sc.next();
                for (int i = 0; i < count; i++) {
                    if (s[i].regdNo.equals(r)) {
                        s[i] = null;
                        System.out.println("Student migrated");
                    }
                }
            }

            else if (ch == 3) {
                for (int i = 0; i < count; i++) {
                    if (s[i] != null)
                        s[i].printData();
                }
            }

            else break;
        }
    }
}