public class question3 {
    public static void main(String[] args) {

        class Employee {
            int id;
            String name;
            double salary;

            Employee(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            void display() {
                System.out.println("Employee ID : " + id);
                System.out.println("Employee Name : " + name);
                System.out.println("Salary : " + salary);
            }
        }

        Employee obj = new Employee(101, "Rahul", 45000);

        obj.display();
    }
}