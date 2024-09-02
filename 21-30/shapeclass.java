abstract class Shape {
    abstract double getPerimeter(int r);

    abstract double getArea(int r);
}

class Circle {
    double getPerimeter(double r) {
        return 2 * Math.PI * r;
    }

    double getArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}

public class shapeclass {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.getPerimeter(3.0));
        System.out.println(obj.getArea(3.0));
    }
}
