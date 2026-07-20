import java.util.Scanner;
  public class PrepThree {
    public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);
     
     int negativeCounter = 0;
     int positiveCounter = 0;
     int largest = 0;     
      int counter = 0;
      
      while ( counter < 10 ){
      
      System.out.print("Enter integer: ");
      int number = input.nextInt();
      
      
      if( number < 0){ 
          negativeCounter++;
        
           } 
      if( number >0){ 
          positiveCounter++;
         }
         
      
      if ( number > largest){
           largest = number;
      
                } 
                    counter++;
                }
         
      System.out.printf( " Negative numbers are: %d%n  Positive numbers are: %d%n Largest numbers are: %d%n" ,negativeCounter,positiveCounter,largest
       );  
          
        
      
      
       
      
      
     
      
    }
    
    }
    
