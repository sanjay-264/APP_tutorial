public class question4 {
    public static void main(String[] args) {

        class Car {
            String model;
            double price;

            Car() {
                model = "Not Available";
                price = 0;
            }

            Car(String model) {
                this.model = model;
                price = 0;
            }

            Car(String model, double price) {
                this.model = model;
                this.price = price;
            }

            void display() {
                System.out.println("Model : " + model);
                System.out.println("Price : " + price);
                System.out.println();
            }
        }

        Car c1 = new Car();
        Car c2 = new Car("Honda City");
        Car c3 = new Car("Toyota Innova", 2500000);

        System.out.println("Car 1");
        c1.display();

        System.out.println("Car 2");
        c2.display();

        System.out.println("Car 3");
        c3.display();
    }
}