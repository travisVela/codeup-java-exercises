package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    //class level movie array and call to Input class
    static Movie[] movies;
    static Input input;

    //method to add movie
    public static void addMovie() {
        input = new Input();

        System.out.println("What is the title? ");
        String title = input.getString();
        System.out.println("What is the category? ");
        String category = input.getString();

        Movie[] newMovies = Arrays.copyOf(movies, movies.length + 1);
        newMovies[newMovies.length - 1] = new Movie(title, category);
        movies = newMovies;
    }

//    print all movies in specific category
    public static void category(String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName());
            }
        }
    }


    public static void main(String[] args) {
        movies = MoviesArray.findAll();
        input = new Input();

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
                    "7 - view movies in the musical category\n" +
                    "9 - add movie"
            );

            System.out.print("Enter your choice -> ");
            int selection = input.getInt();
            System.out.println();


            if (selection == 1) {
                System.out.printf("--------------\n| ALL MOVIES |\n--------------\n");
                for (Movie movie : movies) {
                    System.out.println(movie.getName());
                }
            } else if (selection == 2) {
                System.out.println("------------\n| ANIMATED |\n------------\n");
                category("animated");
            } else if (selection == 3) {
                System.out.println("---------\n| DRAMA |\n---------\n");
                category("drama");
            } else if (selection == 4) {
                System.out.println("----------\n| HORROR |\n----------\n");
                category("horror");
            } else if (selection == 5) {
                System.out.println("----------\n| SCI-FI |\n----------\n");
                category("scifi");
            } else if (selection == 6) {
                System.out.println("----------\n| COMEDY |\n----------\n");
                category("comedy");
            } else if (selection == 7) {
                System.out.println("-----------\n| MUSICAL |\n-----------\n");
                category("musical");
            } else if (selection == 0) {
                System.out.println("\n---------------\n|             |\n| PEACE OUT!! |\n|             |\n---------------\n");
                break;
            } else if (selection == 9) {
                addMovie();
            }
        } while (true);

    }
}
