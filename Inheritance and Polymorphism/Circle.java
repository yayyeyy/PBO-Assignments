class Circle extends Shape { //ini juga extend nya dari shape
    protected double radius;
    protected static final double PI = 22.0 / 7.0;

    Circle(double radius, String color) {
        super(color); //manggil constractor dr parent class
        this.radius = radius;
    }

    double area() {
        return PI * radius * radius;
    }

    @Override
    void printInfo() {
        System.out.println("Circle " + color + ", area = " + area());
    }
}