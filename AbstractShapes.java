abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractShapes {
    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Triangle();
        Shape s3 = new Hexagon();

        s1.numberOfSides();
        s2.numberOfSides();
        s3.numberOfSides();
    }
}
