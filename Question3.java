interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprint();
    void faceRecognition();
}

class BankingApplication implements AdvancedSecurity {
    public void login() {
        System.out.println("Login");
    }

    public void logout() {
        System.out.println("Logout");
    }

    public void fingerprint() {
        System.out.println("Fingerprint authentication");
    }

    public void faceRecognition() {
        System.out.println("Face recognition");
    }
}

class Main {
    public static void main(String[] args) {
        BankingApplication b = new BankingApplication();

        b.login();
        b.fingerprint();
        b.faceRecognition();
        b.logout();
    }
}