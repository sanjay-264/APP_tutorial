package Tutorial1;
import java.util.Scanner;
public class question8 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();
        double total = basic + allowance;
        System.out.println("Total Salary = " + total);
    }
}



