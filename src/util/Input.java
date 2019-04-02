package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo() {
//        System.out.println("Again? [y/n] ");
        String answer = scanner.nextLine();
        return (answer.equals("y") || answer.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        int number;
        do {
            System.out.println("Enter a number: ");
            number  = scanner.nextInt();
        } while (number < min || number > max);
        System.out.println("Great job!!");
        return number;
    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        scanner.next();
        return getInt();
    }

    public double getDouble(double min, double max) {
        double number;
        do {
            System.out.println("Enter a decimal number. ");
            number = scanner.nextDouble();
        } while (number < min || number > max);
        System.out.println("You're doing it!!");
        return number;
    }
}

