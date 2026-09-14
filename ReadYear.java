/**
Question 35

1. import scanner
2. initialize int variable to take year
3. set condition with if statement
*/

import java.util.Scanner;
public class ReadYear{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


    System.out.println("Enter Year: ");
    int year = input.nextInt();
    
 
    
    
    if( year % 4 == 0){ System.out.print("it's a leap year");
    
    }
    else if( year % 4 != 0){ System.out.print("it's not a leap year"); 
    
    }
     
   
    
    
    



}


}
