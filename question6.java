package Tutorial1;
import java.util.Scanner;
public class question6 { 
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Even Seat Number");
        else
            System.out.println("Odd Seat Number");
    }
}

