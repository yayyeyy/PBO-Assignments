class Square extends Shape { //square turunan dari shape
    private double side;

    Square(double side, String color) {
        super(color); //pake super buat manggil constactor dari parent class
        this.side = side;
    }

    double area() { //ngitung luas
        return side * side;
    }

    @Override 
    void printInfo() {
        System.out.println("Square colored " + color + ", area = " + area());
    }
}