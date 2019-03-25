import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        highLow( (int) (Math.random() * 100) + 1);
    }

     public static void highLow(int randomNumber) {
        randomNumber = (int) (Math.random() * 100) + 1;
        int count = 10;
//        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        System.out.println();
        System.out.println("Play the High Low guessing game!");
        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.println("You get 10 guesses\nChoose a number between 1 and 100");
        while (true) {
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("================");
                System.out.println();
                System.out.println("You guessed it!!");
                System.out.println();
                System.out.println("================");
                System.out.print("Do you want to try again? [y/n] ");
                if(scanner.next().equals("n")) {
                    System.out.println("===================");
                    System.out.println();
                    System.out.println("Thanks for playing!!");
                    System.out.println();
                    System.out.println("===================");
                    break;
                } else {
                    highLow(randomNumber);
                }
            } else if (count == 0) {
                System.out.println("============");
                System.out.println();
                System.out.println("Game Over :(");
                System.out.println();
                System.out.println("============");
                System.out.print("Do you want to try again? [y/n] ");
                if(scanner.next().equals("n")) {
                    System.out.println("===================");
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println();
                    System.out.println("===================");
                    break;
                } else {
                    highLow(randomNumber);
                }
            } else if (guess < randomNumber) {
                System.out.println("Higher!!");

            } else if (guess > randomNumber) {
                System.out.println("Lower!!");

            }
            count--;
            System.out.println("(" + count + " guesses left)");

        }
    }
}
