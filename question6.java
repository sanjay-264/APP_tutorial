import java.util.Scanner;
public class question6 {

    public static void main(String[] args) {

        class Employee {
            String name;
            int id;
            String department;

            void display() {
                System.out.println("Name       : " + name);
                System.out.println("ID         : " + id);
                System.out.println("Department : " + department);
            }
        }

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Arun";
        e1.id = 101;
        e1.department = "CSE";

        e2.name = "Priya";
        e2.id = 102;
        e2.department = "ECE";

        System.out.println("Employee 1");
        e1.display();

        System.out.println("\nEmployee 2");
        e2.display();
    }
}
