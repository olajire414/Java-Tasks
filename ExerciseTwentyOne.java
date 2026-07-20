import java.util.Scanner;
public class ExerciseTwentyOne{
    public static void main( String[] args){
    
    Scanner input = new Scanner(System.in);
    
     int number = 0;
     int total = 0;
    
    while (number <= 4){
     
     System.out.print("Enter number: "); 
     int score = input.nextInt();
     
    
     total = total + score;
    
     number++;
    }
     
    System.out.printf("Total: %d", total);
    System.out.println(); 
     
    
        }



}
