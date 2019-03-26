import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        highLow();
    }

    public static void highLow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================\n");
        System.out.println("Play the High Low guessing game!\n");
        System.out.println("================================\n");
        System.out.print("Ready? [y/n] ");

        // ask to play game
        if (scanner.next().equals("y")) {
            scanner.nextLine();
            System.out.println();
            game();
        } else  {
            System.out.println();
            System.out.println("All good. Laters!");
        }
    }

    private static void game() {

    boolean gameIsOver = false;

    // generate random number
    int randomNumber = (int) (Math.random() * 100) + 1;

    // set guess count limit
    int count = 10;

    // initiate new scanner
    Scanner scanner = new Scanner(System.in);

    //set rules. ask for guess
    System.out.println("You get 10 guesses\nChoose a number between 1 and 100");

        while (true) {

            // grab guess
            int guess = scanner.nextInt();
            scanner.nextLine();

            // compare guess to random number

            if (guess == randomNumber) {
                System.out.println("\n\nYou guessed it!!");
                System.out.println("================\n");
                System.out.println("Do you want to try again? [y/n] ");
                if(scanner.next().equals("n")) {
                    System.out.println("\n\nThanks for playing!!");
                    System.out.println("===================\n");
                    break;
                } else {
                    game();
                }
            } else if (count == 1) {
                System.out.println("\n\nGame Over :(");
                System.out.println("============\n");

                System.out.println("Do you want to try again? [y/n] ");
                if(scanner.next().equals("n")) {
                    System.out.println("\n\nThanks for playing!");
                    System.out.println("===================\n");
                    break;
                } else {
                    game();
                }
                break;
            } else if (guess < randomNumber) {
                System.out.println("Higher!!");
                System.out.println();

            } else if (guess > randomNumber) {
                System.out.println("Lower!!");
                System.out.println();
            }

            // decrement count
            count--;

            // log count
            System.out.println("(" + count + " guesses left)");

            // break out of loop if player chooses no to play again
            if (gameIsOver) {
                break;
            }
        }
    }
}