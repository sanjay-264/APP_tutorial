import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    void getData(Scanner sc) {
        System.out.print("Enter Product ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    void display() {
        double total = price * quantity;
        double discount;
        double finalPrice;

        if (total >= 5000)
            discount = total * 0.10;
        else
            discount = total * 0.05;

        finalPrice = total - discount;

        System.out.println("Product ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Total Price : " + total + " ₹");
        System.out.println("Discount : " + discount + " ₹");
        System.out.println("Final Price : " + finalPrice + " ₹");
        System.out.println();
    }
}

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] p = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nProduct " + (i + 1));
            p[i] = new Product();
            p[i].getData(sc);
        }

        System.out.println("\n----- Product Details -----");

        for (int i = 0; i < 5; i++) {
            p[i].display();
        }
    }
}