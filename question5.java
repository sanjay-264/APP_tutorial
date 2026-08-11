public class question5 {
    public static void main(String[] args) {

        class Area {

            void area(int side) {
                System.out.println("Area of Square = " + (side * side));
            }

            void area(int length, int breadth) {
                System.out.println("Area of Rectangle = " + (length * breadth));
            }

            void area(double radius) {
                System.out.println("Area of Circle = " + (3.14 * radius * radius));
            }
        }

        Area obj = new Area();

        obj.area(5);
        obj.area(10, 6);
        obj.area(7.0);
    }
}