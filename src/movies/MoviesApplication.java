package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args){
        int choice = Input.getInt(0,5);

    }

    public static void printmenu(){
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: 1\n" +
                "\n" +
                "Frankenstein -- horror\n" +
                "Goodfellas -- drama\n" +
                "Pulp Fiction -- drama\n" +
                "...");
    }
    public static void printMoviesByCategory(Movie[] movies, String category){
        for (Movie movie: movies){
            if (movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
    public static void printAllMovies(Movie[], movies) {
        for(Movie movie: movies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static boolean executeUserChoice(int choice){
        switch (choice){
            case 0:
                return false;
                break;
            case 1:
                printAllMovies(MoviesArray.findAll());
                break;
            case 2:
                printMoviesByCategory(MoviesArray.findAll());


        }
    }
}
