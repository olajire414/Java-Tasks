/**
Question 52
1. import scanner
2. initialize variable of type int to collect input
3. invoke while statement, set the sentinel value to 0
4. 
*/
import java.util.Scanner;
public class SentinelZero{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

 System.out.print("Enter integer or 0 to quit program ");
    
   int number = input.nextInt();
    
     while(  number != 0){ 
     System.out.print("enter integer ");
     number =input.nextInt();
      
     }
    
  }
     
   }  
    
    
    






