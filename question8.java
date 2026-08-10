import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {

        class Temperature {
            double celsius;
            double fahrenheit;

            void convert() {
                fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Celsius = " + celsius);
                System.out.println("Fahrenheit = " + fahrenheit);
            }
        }

        Scanner sc = new Scanner(System.in);

        Temperature obj = new Temperature();

        System.out.print("Enter temperature in Celsius: ");
        obj.celsius = sc.nextDouble();

        obj.convert();
    }
}