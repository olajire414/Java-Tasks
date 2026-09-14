 import java.util.Scanner;
  public class Exercise417 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int totalMiles = 0;
        int totalGallons = 0;
        
        System.out.println("Gas Mileage Calculator");
        System.out.print("Enter miles driven (or -1 to quit): ");
        int miles = input.nextInt();
        
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();
            
            // Calculate MPG for the current trip
            double tripMPG = (double) miles / gallons;
            System.out.printf("MPG this trip: %.2f%n", tripMPG);
            
            // Accumulate totals
            totalMiles += miles;
            totalGallons += gallons;
            
            // Calculate combined MPG
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined MPG for all trips: %.2f%n%n",        combinedMPG);
            
            // Prompt for next input (sentinel value is -1)
            System.out.print("Enter miles driven (or -1 to quit): ");
            miles = input.nextInt();
        }
        
      
    }
}
