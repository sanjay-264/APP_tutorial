class Vehicle {
    int vehicleNumber, speed;
    String brand;

    Vehicle(int n, String b, int s) {
        vehicleNumber = n;
        brand = b;
        speed = s;
    }

    void displayDetails() {
        System.out.println(vehicleNumber + " " + brand + " " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(int n, String b, int s, int d) {
        super(n, b, s);
        numberOfDoors = d;
    }

    void displayDetails() {
        System.out.println("Car: " + vehicleNumber + " " + brand + " " + speed + " " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(int n, String b, int s, boolean g) {
        super(n, b, s);
        hasGear = g;
    }

    void displayDetails() {
        System.out.println("Bike: " + vehicleNumber + " " + brand + " " + speed + " " + hasGear);
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car(101, "Honda", 120, 4);
        v.displayDetails();

        v = new Bike(102, "Yamaha", 100, true);
        v.displayDetails();
    }
}