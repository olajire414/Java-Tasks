// Question 12

import java.util.Scanner;
    public class LargestNumber{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int largest = 0;
    int counter = 0 ;
     
    System.out.print("Enter number from 0 upward");
      int number = input.nextInt();
    
      while(number != 0){
      if(number > largest){
      largest = number;
      counter = 1;
    }
    else if (number == largest){
            counter++;
    }
           number =input.nextInt();
    }
       System.out.println("The largest number is: "+ largest);
        System.out.print("occurences is :" + counter);
    
    
    }
    }
