import java.util.Scanner;
    public class CalculateEnergy{
    public static void main( String[] args){
     Scanner input = new Scanner (System.in);
     
     System.out.print("Enter the amount of water in kilogram: ");
      double waterInKilogram = input.nextDouble();
      
       System.out.print("Enter the initial temperature of water : ");
     double initialTemperature = input.nextDouble();
     
      System.out.print("Enter the final temperature of water: ");
     double finalTemperature = input.nextDouble();
     
    
       double energyNeeded = waterInKilogram * ( finalTemperature - 
                     initialTemperature) * 4184;
                     
                     System.out.printf("Energy neededed: %.1f%n",energyNeeded);
     
      
    }
    
    }
