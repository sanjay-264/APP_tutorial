import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {

        class Marks {
            int mark1;
            int mark2;
            int mark3;

            void calculate() {
                int total;
                double average;

                total = mark1 + mark2 + mark3;
                average = total / 3.0;

                System.out.println("Total Marks = " + total);
                System.out.println("Average Marks = " + average);
            }
        }

        Scanner sc = new Scanner(System.in);

        Marks obj = new Marks();

        System.out.print("Enter marks of Subject 1: ");
        obj.mark1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        obj.mark2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        obj.mark3 = sc.nextInt();

        obj.calculate();
    }
}