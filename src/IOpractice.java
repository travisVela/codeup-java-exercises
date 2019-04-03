import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOpractice {
    public static void main(String[] args) {
        String directory = "data";
        String filename = "foods";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            List<String> foods = new ArrayList<>();
            foods.add("Hamburger from What-a-burger");
            foods.add("Hamburger from Chester's burgers");
            foods.add("Hamburger from Big Bob's Burgers");
            Files.write(dataFile, foods);

            List<String> Lines = Files.readAllLines(dataFile);
            for (String line : Lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
