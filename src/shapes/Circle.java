package shapes;

public class Circle {
    private double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }


    public static double getArea(double radius){
        System.out.print("The area is ");
        return Math.pow((radius * Math.PI), 2);
    }
    public static double getCircumference(double radius){
        System.out.print("The circumference is ");
        return Math.PI * (radius * 2);

    }
}
