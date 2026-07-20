      import java.util.Scanner;
      
      public class CarMillage{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Destination: ");
      String destination = input.nextLine();
      
      System.out.print("Total Distance in KM: ");
      double distance = input.nextInt();
      
      System.out.print("Price of fuel per litre: ");
      double fuelPrice = input.nextInt();
      
      System.out.print("Fuel Efficiency: ");
      double millage = input.nextInt();
      
      double fuelNeeded = distance/millage;
      
      double totalCost = distance*fuelPrice;
      
      double splitCost = totalCost / 2;
     
      
      System.out.printf("Fuel needed: %.2f%n",fuelNeeded);
       System.out.printf("Total Cost: %.2f%n",totalCost);
       System.out.printf("Split Cost: %.2f%n",splitCost);
       
       
       
      
      
      
      
      }
      
      
      
      }
      
     
