package Tutorial1;
import java.util.Scanner;
public class question5 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score of Student 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter score of Student 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter score of Student 3: ");
        int s3 = sc.nextInt();
        int highest = s1;
        if (s2 > highest)
            highest = s2;
        if (s3 > highest)
            highest = s3;
        System.out.println("Highest Score = " + highest);
    
}
}
