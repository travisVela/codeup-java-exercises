package Contacts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private static Scanner sc = new Scanner(System.in);
    private static String directory = "src/contacts/manager";
    private static String filename = "contacts.txt";
    private static final Path dataDirectory = Paths.get(directory);
    private static final Path dataFile = Paths.get(directory, filename);
    private List<Contact> contacts;

    public Contacts() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts(){
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<String> allContacts (Path filename) {
        List<String> returnList = new ArrayList<>();
        try {
            returnList = Files.readAllLines(filename);
        } catch (IOException e) {
            System.out.println(e);
        }
        return returnList;
    }


    public Contact findContact(List<String> allContacts, String userContact) {
        List<Contact> contactIterator = new ArrayList<>();
        Contact foundContact = new Contact();
        int counter = 0;

        for (String contact : allContacts) {
            if (counter == 0 || counter == 1) {
                counter++;
            } else {
                String[] splitThatContactUp = contact.split("\\|");
                Contact newContact = new Contact(splitThatContactUp[0].trim(), splitThatContactUp[1].trim());
                contactIterator.add(newContact);
            }
        }
        for (Contact contact : contactIterator) {
            if (contact.getName().equalsIgnoreCase(userContact)){
                foundContact = contact;
            }
        }
        return foundContact;
    }

    public List<String> deleteContact(List<String> allContacts, String contactToDelete) {
        String findThisGuyToDeleteIt = "";
        for (String contact : allContacts) {
            if (contact.contains(contactToDelete)) {
                findThisGuyToDeleteIt = contact;
            }
        }
        allContacts.remove(findThisGuyToDeleteIt);
        return allContacts;
    }

}
