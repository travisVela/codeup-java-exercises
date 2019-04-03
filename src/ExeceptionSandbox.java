public class ExeceptionSandbox {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "charlie", "delta", "echo"};
        int i = 7;

        try {
//            if (i < 0 || i >= words.length) {
//                throw new Exception("Array index does not fit");
//            }
            System.out.printf("Beginning of the program%n");
            System.out.println(words[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("This is the built in exception%n");
            System.out.println(e);
        } catch (Exception e) {
            System.out.printf("This is the custom exception%n");
            System.out.println(e);
        } finally {
            System.out.printf("This is from the finally block and will always run%n");
        }
        System.out.println("End of the program dog!");
    }
}
