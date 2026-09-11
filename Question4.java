interface Confidential {
}

class Report {
}

class SalaryReport extends Report implements Confidential {
}

class PublicReport extends Report {
}

class Main {
    public static void main(String[] args) {
        Report r1 = new SalaryReport();
        Report r2 = new PublicReport();

        if(r1 instanceof Confidential)
            System.out.println("Confidential");

        if(r2 instanceof Confidential)
            System.out.println("Not Confidential");
    }
}