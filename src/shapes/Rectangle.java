package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    //implement Measurable methods
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    //inherit from Quadrilateral
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength() {
    }

    public void setWidth() {
    }
}
