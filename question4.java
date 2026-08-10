import java.util.Scanner;
public class question4{
    public static void main(String[] args) {
        class Rectangle {
            double length;
            double breadth;
            void getData() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Length: ");
                length = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                breadth = sc.nextDouble();
            }
            void area() {
                double area;
                area = length * breadth;
                System.out.println("\nArea of Rectangle = " + area);
            }
        }
        Rectangle obj = new Rectangle();
        obj.getData();
        obj.area();
    }
}
