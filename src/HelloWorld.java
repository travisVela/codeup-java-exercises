import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        ®

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What is your favorite color? ");
        String favColor = scanner.nextLine();
        System.out.print("What is your favorite number? ");
        int favNumber = scanner.nextInt();

        System.out.format("Hello, %s. Your favorite color is %s. Your favorite number is %d", name, favColor, favNumber);

    }
}
