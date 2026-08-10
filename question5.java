import java.util.Scanner;
public class question5 {

    public static void main(String[] args) {

        class Student {
            String name;
            int age;

            void display() {
                System.out.println("Name : " + name);
                System.out.println("Age  : " + age);
            }
        }

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahul";
        s1.age = 18;

        s2.name = "Ananya";
        s2.age = 19;

        System.out.println("Student 1");
        s1.display();

        System.out.println("\nStudent 2");
        s2.display();
    }
}
