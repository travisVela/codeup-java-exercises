package shapes;

public class Square extends Quadrilateral {
double side;
    //inherit from Quadrilateral
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    //inherit methods from Quadrilateral which is inherited from Measurable
    public double getPerimeter() {
        return this.side * 4;
    }

    public double getArea() {
        return this.side * this.side;
    }
}

