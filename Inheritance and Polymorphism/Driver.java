public class Driver {
    public static void main(String[] args) {

        Square square = new Square(5, "blue");
        square.printInfo();

        Circle circle = new Circle(7, "green");
        circle.printInfo();

        Circle cylinder = new Cylinder(10, 7, "yellow");
        cylinder.printInfo();
    }
}