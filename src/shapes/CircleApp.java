package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {

        Input in = new Input();
        System.out.println("Enter the radius of a circle. ");
        int num = in.getInt();
        System.out.println(Circle.getArea(num));
        System.out.println(Circle.getCircumference(num));
        System.out.println(Input.yesNo());
    }


}
