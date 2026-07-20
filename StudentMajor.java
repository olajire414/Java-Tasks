
//Question 4

import java.util.Scanner;
    public class StudentMajor{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    char major1 = 'I';
    char major2 = 'c';
    char major3 = 'A';
    
    
    
    System.out.print(" Enter letter in uppercase: ");
    char major = input.next().charAt(0);
    
    System.out.print(" Enter digit: ");
    int digit = input.nextInt();
    
     if(major == major1){
     
       System.out.print(" Information Management my year status is ");
      
     }
    else if(major == major2){
       System.out.print(" Computer Science my year status is ");
    
    }
    else if(major == major3){
         System.out.print("Accounting  my year status is ");
         }
    else{ System.out.print("invalid input");
    
    }
    
    
    
    
     if(digit == 1){
     
       System.out.println(" Freshman");
      
     }
    else if(digit == 2){
       System.out.println("Sophomore");
    
    }
    else if(digit == 3){
         System.out.println("Junior");
         }
         
         
    else if(digit == 4){
         System.out.println("Senior");
         }
         
    else{ System.out.println("invalid input");
    
    }
    
    
    
    }
    }
