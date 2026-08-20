import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int[] marks = new int[3];
    double attendance;

    void getData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter Attendance: ");
        attendance = sc.nextDouble();
    }

    void display() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total = total + marks[i];
        }

        double average = total / 3.0;

        String result = average >= 50 ? "Pass" : "Fail";

        String scholarship =
                (average >= 75 && attendance >= 80)
                ? "Eligible"
                : "Not Eligible";

        String performance =
                average >= 85 ? "Excellent" : "Good";

        System.out.println("\nRoll Number : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Result : " + result);
        System.out.println("Scholarship : " + scholarship);
        System.out.println("Performance : " + performance);

        System.out.println();
    }

    double getAverage() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total = total + marks[i];
        }

        return total / 3.0;
    }
}

public class question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1));

            s[i] = new Student();
            s[i].getData(sc);
        }

        System.out.println("\n----- Student Details -----");

        for (int i = 0; i < 5; i++) {
            s[i].display();
        }

        int highest = 0;

        for (int i = 1; i < 5; i++) {
            if (s[i].getAverage() > s[highest].getAverage()) {
                highest = i;
            }
        }

        System.out.println("Student with Highest Average:");
        System.out.println("Name : " + s[highest].name);
        System.out.println("Average : " + s[highest].getAverage());
    }
}