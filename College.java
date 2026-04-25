import java.util.Scanner;

public class College {

    // Outer class data member
    String collegeName;

    // Outer class constructor
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    // ─────────────────────────────────────────
    // Non-static Inner Class
    // ─────────────────────────────────────────
    class Admission {

        // Inner class data members
        String studentName;
        String course;

        // Method to accept student information
        void readAdmissionData() {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Student Name : ");
            studentName = input.nextLine();

            System.out.print("Enter Course Name  : ");
            course = input.nextLine();
        }

        // Method to display complete admission details
        void displayAdmissionData() {
            System.out.println("\n=============================");
            System.out.println("    ADMISSION DETAILS        ");
            System.out.println("=============================");
            System.out.println("College Name  : " + collegeName); // accessing outer class variable
            System.out.println("Student Name  : " + studentName);
            System.out.println("Course        : " + course);
            System.out.println("=============================");
        }
    }

    // ─────────────────────────────────────────
    // Main Method
    // ─────────────────────────────────────────
    public static void main(String[] args) {

        // Step 1: Create object of outer class College
        College college = new College("Springfield University");

        // Step 2: Use outer object to create inner class object
        College.Admission admission = college.new Admission();

        // Step 3: Accept student data
        admission.readAdmissionData();

        // Step 4: Display complete admission details
        admission.displayAdmissionData();
    }
}