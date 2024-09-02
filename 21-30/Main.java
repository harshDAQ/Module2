interface Shape {
    double calculateArea();
    void displayInfo();
}

interface CloneableShape extends Shape {
    CloneableShape cloneShape();
}

class Circle implements CloneableShape {
    private int radius;
    private double area;

    Circle(int radius) {
        this.radius = radius;
        calculateArea();  // Calculate area upon instantiation
    }

    @Override
    public double calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle: Radius = " + radius + ", Area = " + area);
    }

    @Override
    public CloneableShape cloneShape() {
        return new Circle(this.radius);  // Create a new Circle with the same radius
    }
}

class Rectangle implements CloneableShape {
    private int length, breadth;
    private double area;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        calculateArea();  // Calculate area upon instantiation
    }

    @Override
    public double calculateArea() {
        area = length * breadth;
        return area;
    }

    @Override
    public void displayInfo() {
        System.out.println("Rectangle: Length = " + length + ", Breadth = " + breadth + ", Area = " + area);
    }

    @Override
    public CloneableShape cloneShape() {
        return new Rectangle(this.length, this.breadth);  // Create a new Rectangle with the same dimensions
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Clone the shapes
        Circle clonedCircle = (Circle) circle.cloneShape();
        Rectangle clonedRectangle = (Rectangle) rectangle.cloneShape();

        // Display info for the original and cloned shapes
        System.out.println("Original Shapes:");
        circle.displayInfo();
        rectangle.displayInfo();

        System.out.println("\nCloned Shapes:");
        clonedCircle.displayInfo();
        clonedRectangle.displayInfo();
    }
}