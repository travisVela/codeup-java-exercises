import java.util.Scanner;
import java.awt.event.KeyEvent;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, meet Bob. He's all ears\ntype 'end' to leave the conversation.");

        while (true) {
            System.out.println("...");
            System.out.println();
            String message = scanner.nextLine();


            if (message.endsWith("?")) {
                message = "Sure";
                System.out.println(message);
                System.out.println();
            } else if (message.endsWith("!")) {
                message = "Whoa, chill out!";
                System.out.println(message);
                System.out.println();
            } else if (message.equals("end")) {
                break;
            } else if (message.equals("") || message.indexOf("?") == -1 || message.indexOf("!") == -1) {
                message = "Whatever.";
                System.out.println(message);
                System.out.println();
            }



        }
    }
}
