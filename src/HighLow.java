import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int count = 1;
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        System.out.println();
        System.out.println("Play the High Low guessing game!");
        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.println("Choose a number between 1 and 100");
        while (true) {
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("================");
                System.out.println();
                System.out.println("You guessed it!!");
                System.out.println();
                System.out.println("================");
                break;
            } else if (count == 5) {
                System.out.println("============");
                System.out.println();
                System.out.println("Game Over :(");
                System.out.println();
                System.out.println("============");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Higher!!");
                System.out.println(count);
            } else if (guess > randomNumber) {
                System.out.println("Lower!!");
                System.out.println(count);
            }
            count++;
        }
    }
}
