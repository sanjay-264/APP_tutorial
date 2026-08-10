import java.util.Scanner;
public class question2{
    public static void main(String[] args) {
        class Book {
            String title;
            String author;
            double price;
            void getData() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Book Title: ");
                title = sc.nextLine();
                System.out.print("Enter Author Name: ");
                author = sc.nextLine();
                System.out.print("Enter Book Price: ");
                price = sc.nextDouble();
            }
            void display() {
                System.out.println("\nBook Details");
                System.out.println("Title  : " + title);
                System.out.println("Author : " + author);
                System.out.println("Price  : " + price);
            }
        }
        Book obj = new Book();
        obj.getData();
        obj.display();
    }
}

