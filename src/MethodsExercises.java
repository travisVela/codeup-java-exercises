import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println("123 + 55 = " + addition(123, 55));
        System.out.println("123 - 55 = " + subtraction(123, 55));
        System.out.println("123 * 55 = " + multiplication(123, 55));
        System.out.println("123 / 55 = " + division(123, 55));
        System.out.println("123 % 55 = " + modulus(123, 55));
        getInteger(1, 10);
        numberFactorial(1, 10);
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
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return getInteger(min, max);
        } else {
            System.out.printf("%d is not in range.%n", userInput);
            return userInput;
        }
    }

    public static long numberFactorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = scanner.nextInt();
        long fact = 1;
        String result = "";
        if (input >= min && input <= max) {
            for (int i = 1; i <= input; i++) {
                fact *= i;
                result += i + " x ";
                System.out.printf("%d! = %s = %d%n", i, result.substring(0, result.length() - 2), fact);
            }
            return fact;
        }
        return fact;
    }

}
