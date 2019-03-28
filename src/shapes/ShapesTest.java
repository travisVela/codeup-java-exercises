package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("perimeter of box1 is: " + box1.getPerimeter() + "ft.");
        System.out.println("Area of box1 is: " + box1.getArea() + "ft.");
        System.out.println();

        Rectangle box2 = new Square(5);
        System.out.println("perimeter of box2 is: " + box2.getPerimeter() + "ft.");
        System.out.println("Area of box2 is: " + box2.getArea() + "ft.");
    }
}
