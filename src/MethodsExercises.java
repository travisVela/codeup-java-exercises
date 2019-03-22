import java.util.Scanner;

public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("123 & 55 = " + addition(123, 55));
        System.out.println("123 - 55 = " + subtraction(123, 55));
        System.out.println("123 * 55 = " + multiplication(123, 55));
        System.out.println("123 / 55 = " + division(123, 55));
        System.out.println("123 % 55 = " + modulus(123, 55));
        getInteger(1, 10);
    }

    public static int addition(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int subtraction(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static double division(int arg1, int arg2) {
        return arg1 / arg2;
    }

    public static int modulus(int arg1, int arg2) {
        return arg1 % arg2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

}
