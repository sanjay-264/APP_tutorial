package Tutorial1;
import java.util.Scanner;
public class question2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first price: ");
        int a = sc.nextInt();
        System.out.print("Enter second price: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Quotient = " + (a / b));
        System.out.println("Remainder = " + (a % b));
    }
}
