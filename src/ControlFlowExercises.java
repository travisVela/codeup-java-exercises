import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer. ");
        int num = scanner.nextInt();

        String n = "number";
        String sq = "squared";
        String cube = "cubed";
        int nLength = n.length();
        int sqLength = sq.length();
        int cubeLength = cube.length();

        String dash = "-";
        System.out.println();
        System.out.println("Here is your table: ");
        System.out.println();
        System.out.println();
        System.out.printf("%-7s| %-7s | %-7s%n", n, sq, cube);
        System.out.printf("------ | ------- | -----%n");


        for (long i = 1; i <= num; i++) {
            long s = i * i;
            long c = i * i * i;
            System.out.printf("%-7d| %-7d | %-7d%n", i, s, c);

        }
    }
}
