import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MovieRating {
    
   static final int MAX_MOVIES = 100;
    
  
   static final String[] movieNames = new String[MAX_MOVIES];
   static final double[] totalMovieScores = new double[MAX_MOVIES];
   static final int[] movieRatingCounts = new int[MAX_MOVIES];
   static final LocalDateTime[] movieAddTimes = new LocalDateTime[MAX_MOVIES];
    
    static int movieCounter = 0;
    static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    
    public static void addMovie(String name) {
        if (movieCounter >= MAX_MOVIES) {
            System.out.println("Error: System memory full.");
            return;
        }
        
        
        for (int index = 0; index < movieCounter; index++) {
            if (movieNames[index].equalsIgnoreCase(name)) {
                System.out.println("Movie '" + name + "' already exists");
                return;
            }
        }

        movieNames[movieCounter] = name;
        totalMovieScores[movieCounter] = 0.0;
        movieRatingCounts[movieCounter] = 0;
        movieAddTimes[movieCounter] = LocalDateTime.now(); 
        
       movieCounter++;
        System.out.println("Movie '" + name + "' added");
    }

   
    public static void rateMovie(String name, double score) {
        if (score < 1.0 || score > 5.0) {
            System.out.println("invalid input");
            return;
        }

        for (int index = 0; index < movieCounter; index++) {
            if (movieNames[index].equalsIgnoreCase(name)) {
                totalMovieScores[index] += score;
                movieRatingCounts[index] += 1;
                System.out.println("Rating added for '" + movieNames[index] + "' " + score);
                return;
            }
        }
        System.out.println("Movie not found");
    }

   
    public static void viewAverageRatings() {
        if (movieCounter == 0) {
            System.out.println("No average yet.");
            return;
        }

        System.out.println("\n--- MOVIE AVERAGE RATINGS ---");
        for (int index = 0; index < movieCounter; index++) {
            double avg = 0.0;
            if (movieRatingCounts[index] > 0) {
                avg = totalMovieScores[index] / movieRatingCounts[index];
            }
            String date = movieAddTimes[index].format(formatter);
            System.out.printf("Movie: %-15s | Average Rating: %.1f/5.0 (%d votes) | Added: %s%n", 
                movieNames[index], avg, movieRatingCounts[index], date);
        }
        
    }

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean rate = true;

        while (rate) {
            System.out.println("--- Orion Movie Rating App---");
            System.out.println();
            System.out.println("1. Add a Movie");
            System.out.println("2. Rate a Movie");
            System.out.println("3. View Average Ratings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter the movie name: ");
                String name = input.nextLine();
                addMovie(name);
                System.out.println();
                
            } else if (choice == 2) {
                System.out.print("Enter the movie name: ");
                String name = input.nextLine();
                System.out.print("Enter your rating (1-5): ");
                double rating = input.nextDouble();
                input.nextLine(); 
                rateMovie(name, rating);
                System.out.println();
                
            } else if (choice == 3) {
                viewAverageRatings();
                
            } else if (choice == 4) {
                System.out.println("Exiting the application.");
                rate = false;
            } else {
                System.out.println("Invalid input. Try again.\n");
            }
        }
        
    }
}


