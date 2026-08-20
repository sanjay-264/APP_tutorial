import java.util.Scanner;

class Patient {
    String name;
    double fee;

    Patient(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    double finalAmount(double discount) {
        return fee - discount;
    }

    void display() {
        double discount;

        if (fee >= 2000)
            discount = fee * 0.10;
        else
            discount = fee * 0.05;

        double finalFee = finalAmount(discount);

        System.out.println("Patient Name : " + name);
        System.out.println("Original Fee : " + fee);
        System.out.println("Discount : " + discount);
        System.out.println("Final Amount : " + finalFee);
        System.out.println();
    }
}

public class question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient[] p = new Patient[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nPatient " + (i + 1));

            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            p[i] = new Patient(name, fee);
        }

        System.out.println("\n----- Patient Details -----");

        for (int i = 0; i < 5; i++) {
            p[i].display();
        }
    }
}