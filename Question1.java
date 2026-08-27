import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    private double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance : " + balance);
    }
}

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount obj = new BankAccount(number, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        obj.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();
        obj.withdraw(withdraw);

        System.out.println("\nUpdated Account Details");
        obj.display();
    }
}