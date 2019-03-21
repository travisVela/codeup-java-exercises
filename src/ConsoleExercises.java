import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println();
//        System.out.printf("The value of pi is approximately %.2f.", pi);
//        System.out.println();
//
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer. ");
//        int userNum = scanner.nextInt();
//        System.out.format("The integer is %d", userNum);
//
//        System.out.println();
//        System.out.println();
//        System.out.print("Please enter 3 words. ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        scanner.nextLine();
//        System.out.printf("The 3 words are 1: %s, 2: %s, 3: %s", word1, word2, word3);
//
//
//        System.out.println();
//        System.out.println("Please enter a sentence. ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("User sentence: %s", userSentence);

        System.out.println();
        System.out.print("We need the area of the classroom. \n");
        System.out.print("Enter your guess for the length in feet. ");
        String length = scanner.nextLine();
//        int lengthInt = Integer.parseInt(length);
//        System.out.print("Enter your guess for width in feet. ");
//        String width = scanner.nextLine();
//        int widthInt = Integer.parseInt(width);
//        int area = lengthInt * widthInt;
//        int perimeter = (lengthInt * 2) + (widthInt * 2);

        double lengthInt = Double.parseDouble(length);
        System.out.print("Enter your guess for width in feet. ");
        String width = scanner.nextLine();
        double widthInt = Double.parseDouble(width);
        System.out.print("Enter your guess for height in feet. ");
        String height = scanner.nextLine();
        double heightInt = Double.parseDouble(height);
        double area = lengthInt * widthInt;
        double perimeter = (lengthInt * 2) + (widthInt * 2);
        double volume = lengthInt * widthInt * heightInt;

//        System.out.printf("Area of the classroom is %sft.\nPerimeter of the classroom is %sft.", area, perimeter);
        System.out.printf("Area of the classroom is %.2fft.\nPerimeter of the classroom is %.2fft.\nVolume of the room is %.2fft", area, perimeter, volume);
        System.out.println();
    }
}
