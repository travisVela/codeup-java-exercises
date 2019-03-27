public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {
                "attractive",
                "agreeable",
                "angry",
                "big",
                "bald",
                "beautiful",
                "glossy",
                "clumsy",
                "massive",
                "defeated"
        };
        String[] nouns = {
                "tiger",
                "leopard",
                "cat",
                "dog",
                "elephant",
                "monkey",
                "hippo",
                "lizard",
                "rat",
                "bird"
        };
        System.out.println("Here is your server name:\n" + random(adjectives) + "-" + random(nouns)+ "\n");
        System.out.println("Here is your server name:\n" + random(adjectives) + "-" + random(nouns)+ "\n");
        System.out.println("Here is your server name:\n" + random(adjectives) + "-" + random(nouns)+ "\n");
    }

    public static String random(String[] array) {
        int randomNumber = (int) ((Math.random() * array.length) + 1) -1;
        return array[randomNumber];
    }



}
