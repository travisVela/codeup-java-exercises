import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a numerical grade. ");
            int grade = scanner.nextInt();

            if (grade >= 88) {
                System.out.print("The letter grade equivalent is A");
            } else if (grade < 88 && grade >= 80) {
                System.out.print("The letter grade equivalent is B");
            } else if (grade < 80 && grade >= 67) {
                System.out.print("The letter grade equivalent is C");
            } else if (grade < 67 && grade >= 60) {
                System.out.print("The letter grade equivalent is D");
            } else if (grade < 60) {
                System.out.print("The letter grade equivalent is F");
            }
            System.out.println();
            scanner.nextLine();

            //continue?
            System.out.println("Would you like to continue? [y/n]");
            if (scanner.nextLine().equals("n")) {
                break;
            }
        }
    }
}
