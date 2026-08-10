package Tutorial1;
import java.util.Scanner;
public class question1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Year of Study: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter College Name: ");
        String college = sc.nextLine();
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Reg No     : " + regNo);
        System.out.println("Department : " + dept);
        System.out.println("Year       : " + year);
        System.out.println("College    : " + college);
    }
}