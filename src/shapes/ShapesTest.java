package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1 = new Square(5);
        Measurable myShape2 = new Rectangle(4, 5);

        System.out.println("myShape 1 area = " + myShape1.getArea() + "\nmyShape 1 perimeter = " + myShape1.getPerimeter());
        System.out.println("myShape 1 area = " + myShape2.getArea() + "\nmyShape 2 perimeter = " + myShape2.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("perimeter of box1 is: " + box1.getPerimeter() + "ft.");
//        System.out.println("Area of box1 is: " + box1.getArea() + "ft.");
//        System.out.println();
//
//        Square box2 = new Square(5);
//        System.out.println("perimeter of box2 is: " + box2.getPerimeter() + "ft.");
//        System.out.println("Area of box2 is: " + box2.getArea() + "ft.");

    }
}
