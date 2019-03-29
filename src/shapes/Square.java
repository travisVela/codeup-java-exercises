package shapes;

public class Square extends Quadrilateral {
double side;
    //inherit from Quadrilateral
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public void setLength() {

    }

    public void setWidth() {

    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public double getArea() {
        return this.side * this.side;
    }
}

