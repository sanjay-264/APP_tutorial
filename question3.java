import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void getData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Monthly Salary : " + salary);
    }

    double annualSalary() {
        return salary * 12;
    }

    double bonus() {
        if (salary >= 30000)
            return annualSalary() * 0.10;
        else
            return 0;
    }

    void eligibility() {
        if (salary >= 30000)
            System.out.println("Bonus Eligibility : Eligible");
        else
            System.out.println("Bonus Eligibility : Not Eligible");
    }
}

public class question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] e = new Employee[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nEmployee " + (i + 1));

            e[i] = new Employee();
            e[i].getData(sc);
        }

        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < 5; i++) {

            e[i].display();

            System.out.println("Annual Salary : " + e[i].annualSalary());
            System.out.println("Bonus : " + e[i].bonus());

            e[i].eligibility();

            System.out.println();
        }
    }
}