package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle () {
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
