import java.util.Scanner;
    public class Acceleration{
    public static void main( String[] args){
     Scanner input = new Scanner (System.in);
     
     System.out.print("Enter starting velocity in meters ");
      double startingVelocity = input.nextDouble();
      
       System.out.print("Enter ending velocity in meters : ");
     double  endingVelocity = input.nextDouble();
     
      System.out.print("Enter time span in second: ");
     double time = input.nextDouble();
     
    
       double averageAcceleration = (endingVelocity - startingVelocity) / time;
                     
        System.out.printf("Average acceleratin is: %.4f%n",averageAcceleration );
     
      
    }
    
    }
