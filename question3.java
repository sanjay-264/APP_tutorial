import java.util.Scanner;
public class question3{

    public static void main(String[] args) {
        class Student {
            String name;
            int rollno;
            void getData() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Student Name: ");
                name = sc.nextLine();
                System.out.print("Enter Roll Number: ");
                rollno = sc.nextInt();
            }
            void display() {
                System.out.println("\nStudent Details");
                System.out.println("Name    : " + name);
                System.out.println("Roll No : " + rollno);
            }
        }
        Student obj = new Student();
        obj.getData();
        obj.display();
    }
}
