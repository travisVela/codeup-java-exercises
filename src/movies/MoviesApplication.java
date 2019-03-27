package movies;
import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

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

            // grab all movies
            if (selection == 1) {
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName());
                }
            }


            //grab animated movies
            if (selection == 2) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());
                    }
                }
            }

            //grab dramas
            if (selection == 3) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());
                    }
                }
            }

            //grab horror flicks
            if (selection == 4) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());
                    }
                }
            }

            //grab sci-fi movies
            if (selection == 5) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
            }

            //grab comedies
            if (selection == 6) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("comedy")) {
                        System.out.println(movie.getName());
                    }
                }
            }

            //grab musicals
            if (selection == 7) {
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("musical")) {
                        System.out.println(movie.getName());
                    }
                }
            }
            if (selection == 0) {
                System.out.println("\nPEACE OUT!!\n");
                break;
            }
        } while (true);

    }
}
