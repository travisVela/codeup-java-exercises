import java.util.Scanner;
//import java.awt.event.KeyEvent
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, meet Bob. He's all ears.\n(type 'end' to leave the conversation.)");
        int count = 1;
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
            } else if (count == 10) {
                System.out.println("*  Bob stormed off\n*  Give him space\n*  He'll come around.");
                break;
            } else if (count == 5) {
                System.out.println("*  Bob is getting impatient\n*  tread lightly.");
            } else if (message.equals("end")) {
                break;
            } else if (message.equals("")) {
                message = "Fine. Be that way!";
                System.out.println(message);
                System.out.println();
            } else if (message.indexOf("?") == -1 || message.indexOf("!") == -1) {
                System.out.println("Whatever.");
                System.out.println();
            }

            count += 1;

        }
    }
}
