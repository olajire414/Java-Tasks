import java.util.Scanner;
  public class Prep {
    public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);
     
     int largest = 0;
     
     System.out.print("Enter integer");
      int number = input.nextInt();
      largest =number;
      
      int counter = 0;
      
      while ( counter < 8){
      System.out.print("Enter integer");
      number = input.nextInt();
      
      if( number > largest){ 
       largest = number;
        
      }
      counter++;
      
      System.out.printf("largest: %d%n", largest);
      }
     
      
    }
    
    }
    
