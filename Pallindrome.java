import java.util.Scanner;
  public class Pallindrome{
    public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
     
     int number = 0;
    String message = "incorrect";    
    
        while ( number <=10000){
        
        System.out.print("Enter number: ");
        number = input.nextInt();
    
        number++;
        
       if(number < 10000 )
     
       { System.out.printf("%s%n",message);}
       
       
     }  
           
           
       
       }
       
    
      
   
     
      
      
  
    
      
    }
    
    
    
