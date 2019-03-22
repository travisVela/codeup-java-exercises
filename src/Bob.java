import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, meet Bob.");

        while (true) {
            System.out.println("...");
            String message = scanner.nextLine();


            if (message.endsWith("?")) {
                message = "Sure";
                System.out.println(message);
            } else if (message.endsWith("!")) {
                message = "Whoa, chill out!";
                System.out.println(message);
            } else if (message.equals("") || message.indexOf("?") == -1 || message.indexOf("!") == -1) {
                message = "Whatever.";
                System.out.println(message);
            }

            //continue?
//            System.out.println("Would you like to continue? [y/n]");
//            if (scanner.nextLine().equals("n")) {
//                break;
//            }
        }
    }
}
