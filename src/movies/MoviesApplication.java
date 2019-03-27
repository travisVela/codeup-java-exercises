package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        do {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n" +
                    "6 - view movies in the comedy category\n" +
                    "7 - view movies in the musical category"
            );

            System.out.print("Enter your choice -> ");
            int selection = in.getInt();
            System.out.println();


            if (selection == 1) {
                System.out.printf("//////////////\n/ ALL MOVIES /\n//////////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName());
                }
            } else if (selection == 2) {
                System.out.println("////////////\n/ ANIMATED /\n////////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 3) {
                System.out.println("/////////\n/ DRAMA /\n/////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 4) {
                System.out.println("//////////\n/ HORROR /\n//////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 5) {
                System.out.println("//////////\n/ SCI-FI /\n//////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 6) {
                System.out.println("//////////\n/ COMEDY /\n//////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("comedy")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 7) {
                System.out.println("///////////\n/ MUSICAL /\n///////////\n");
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("musical")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 0) {
                System.out.println("\n///////////////\n/             /\n/ PEACE OUT!! /\n/             /\n///////////////\n");
                break;
            }
        } while (true);

    }
}
