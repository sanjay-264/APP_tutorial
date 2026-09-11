interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Credit Card: " + amount);
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("UPI: " + amount);
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Net Banking: " + amount);
    }
}

class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(2000);

        p = new NetBankingPayment();
        p.pay(3000);
    }
}