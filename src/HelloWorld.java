public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 7;
        System.out.println("My favorite number is " + myFavoriteNumber);

        String myString = "This is my string.";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println("My floating integer is " + myNumber);

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /=  y;
        y -= x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
