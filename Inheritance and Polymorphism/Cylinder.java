class Cylinder extends Circle { //ini nge extend dr circle
    private double height;

    Cylinder(double height, double radius, String color) {
        super(radius, color); //manggil constructor circle
        this.height = height;
    }

    double volume() {
        return area() * height; //(area) itu method punya circle
    }

    @Override
    void printInfo() {
        System.out.println("Cylinder " + color + ", volume = " + volume());
    }
}