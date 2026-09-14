import java.util.Scanner;
public class AverageSpeed2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Distance Travelled in KM: ");
    double distance = input.nextDouble();
    
    System.out.print("Time Taken in Hours and minutes: ");
    double time = input.nextDouble();
   
    double averageSpeed = distance/time; 
    

System.out.printf("Average Speed in Km/hr is: %.2f%n", averageSpeed);


}


}
