package util;

import java.util.Scanner;

public class Input {
    private static Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return sc.nextLine();
    }

    public static boolean yesNo() {
//        System.out.println("Again? [y/n] ");
        String answer = sc.nextLine();
        return (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        String input = sc.nextLine();
        int num;
        try {
            num = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println(e);
            num = getInt();
        }
        return num;
    }


    public int getInt(int min, int max) {
        Integer userInt;
        String input = sc.nextLine();
        try {
            userInt = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println(e);
            return getInt(min, max);
        }
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        return getInt(min, max);
    }

    public double getDouble() {
        String input = sc.nextLine();
        double num;
        try {
            num = Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println(e);
            num = getDouble();
        }
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        }
        return num;
    }

    public double getDouble(double min, double max) {
        double userDouble;
        String input = sc.nextLine();
        try {
            userDouble = Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println(e);
            return getDouble(min, max);
        }

        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else if (userDouble < min || userDouble > max) {
            System.out.println("Out of range");
        }
        return getDouble(min, max);
    }

}

