class Account {
    int number;
    String name;

    Account(int n, String s) {
        number = n;
        name = s;
    }

    void displayDetails() {
        System.out.println(number + " " + name);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int n, String s) {
        super(n, s);
    }

    void displayDetails() {
        System.out.println("Savings: " + number + " " + name);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int n, String s) {
        super(n, s);
    }

    void displayDetails() {
        System.out.println("Current: " + number + " " + name);
    }
}

interface Payment {
    void pay(double amount);
}

interface SecurePayment extends Payment {
    void verifyPayment();
}

interface OnlineTransaction {
}

class UPIPayment implements SecurePayment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }

    public void verifyPayment() {
        System.out.println("UPI verified");
    }
}

class CardPayment implements Payment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Card payment: " + amount);
    }
}

class Main {
    public static void main(String[] args) {

        Account a;

        a = new SavingsAccount(101, "Ravi");
        a.displayDetails();

        a = new CurrentAccount(102, "Kiran");
        a.displayDetails();

        Payment p;

        p = new UPIPayment();
        p.pay(500);
        ((UPIPayment)p).verifyPayment();

        p = new CardPayment();
        p.pay(1000);

        if(p instanceof OnlineTransaction)
            System.out.println("Online transaction");
    }
}