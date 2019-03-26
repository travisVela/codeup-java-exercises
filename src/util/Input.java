package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        String string =  scanner.nextLine();
        return string;
    }

    public boolean yesNo() {
        System.out.println("Enter something");
        return scanner.next().equals("y");
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

