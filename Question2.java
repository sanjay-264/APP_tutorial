class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Professor extends Employee {

    Professor(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateSalary() {
        return salary + salary * 0.20;
    }
}

class LabAssistant extends Employee {

    LabAssistant(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateSalary() {
        return salary + salary * 0.10;
    }
}

class AdministrativeStaff extends Employee {

    AdministrativeStaff(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateSalary() {
        return salary + salary * 0.05;
    }
}

public class Question2{
    public static void main(String[] args) {

        Employee e1 = new Professor("Rahul", 101, 50000);
        Employee e2 = new LabAssistant("Priya", 102, 30000);
        Employee e3 = new AdministrativeStaff("Arun", 103, 25000);

        System.out.println("Professor Salary : " + e1.calculateSalary());
        System.out.println("Lab Assistant Salary : " + e2.calculateSalary());
        System.out.println("Administrative Staff Salary : " + e3.calculateSalary());
    }
}