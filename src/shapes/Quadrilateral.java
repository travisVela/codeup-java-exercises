package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //constructor for length and width
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //setters
    public abstract void setLength();

    public abstract void setWidth();

}
