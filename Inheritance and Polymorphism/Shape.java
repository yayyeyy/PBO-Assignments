class Shape { //parent class nya square and circle
    protected String color; //attribute, protected biar bisa dipake di kelas turunannya

    Shape(String color) { //constructor
        this.color = color; //attribute punya object
    }

    String getColor() { //ngambil or ngembaliin nilai color
        return color;
    }

    void setColor(String color) { //ngubah nilai color
        this.color = color;
    }

    void printInfo() {
        System.out.println("Shape colored " + color);
    }
}