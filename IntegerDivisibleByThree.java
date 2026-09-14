import java.util.Scanner;
  public class IntegerDivisibleByThree{
    public static void main(String[] args){
   
     
     int sum = 0;
     int number = 1;
      int divisible = 0;
     
    
     
     
     while( number <= 30){
     
        
       if(number % 3 == 0){
       
       divisible = number;
       sum = sum + divisible;
      
       }
       number++;
   
     }
      
      
     System.out.printf("Sum  Of Integer Divisible By Three: %d%n ", sum);
    
    
      
    }
    
    }
    
