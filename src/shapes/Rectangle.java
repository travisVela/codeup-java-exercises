package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    //inherit from Quadrilateral
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length) {
    }

    public void setWidth(double width) {
    }

    //implement Measurable methods
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }
}
