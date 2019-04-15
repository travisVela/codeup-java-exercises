package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsApplication {
    private static Scanner sc = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
    private static String directory = "src/contacts/manager";
    private static String filename = "contacts.txt";
    private static final Path dataDirectory = Paths.get(directory);
    private static final Path dataFile = Paths.get(directory, filename);


    public static void main(String[] args) {

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectory(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            List<String> contacts = new ArrayList<>();
            Files.write(dataFile, contacts);
        } catch (IOException e) {
            System.out.println(e);
        }

        String answer;
        int choice;

        do {
            System.out.println("1. View contacts\n" +
                    "2. Add a new Contact\n" +
                    "3. Search a Contact by name\n" +
                    "4. Delete an existing Contact\n" +
                    "5. Exit");
            System.out.print("Enter an option (1, 2, 3, 4 or 5) ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    List<String> allContacts = contacts.allContacts(dataFile);
                    for (String contact : allContacts) {
                        System.out.println(contact);
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Enter Contact name.");
                        String name = sc.nextLine();
                        System.out.println("Enter Contact phone number ");
                        String phoneNumber = sc.nextLine();

                        try {
                            Files.write(
                                    Paths.get(directory, filename),
                                    Arrays.asList(name + " | " + phoneNumber),
                                    StandardOpenOption.APPEND
                            );
                        } catch (IOException e) {
                            System.out.println(e);
                        }
                        System.out.println("Enter another Contact? [y/n]");
                        if (sc.nextLine().equalsIgnoreCase("n")) {
                            break;
                        }
                    } while (true);
                    break;
                case 3:
                    System.out.println("Enter name to search for.");
                    String findThisGuy = sc.nextLine();
                    allContacts = contacts.allContacts(dataFile);
                    Contact anotherContact = contacts.findContact(allContacts, findThisGuy);
                    if (anotherContact.getName() == null) {
                        System.out.println("No Contact found.");
                    } else {
                        System.out.println(anotherContact.getName());
                        System.out.println(anotherContact.getPhoneNumer());
                    }
                    break;
                case 4:
                    System.out.println("Enter name of Contact to delete.");
                    String deleteThisGuy = sc.nextLine();
                    allContacts = contacts.allContacts(dataFile);
                    List<String> newContactList = contacts.deleteContact(allContacts, deleteThisGuy);

                    try {
                        Files.write(dataFile, newContactList);
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
            System.out.println("Would you like to continue? ");
            answer = sc.nextLine();

        } while (answer.equals("y"));

    }
}
