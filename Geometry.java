import java.util.Scanner;
  public class Geometry{
    public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
     double sideOne = xOne * yTwo ;
     double sideTwo = xTwo * yTwo ;
     double sideThree = xThree * yThree;
     double sum = sideOne + sideTwo + sideThree ;
     double xOne = 0;
     double yOne = 0;
     double xTwo = 0;
     double yTwo = 0;
     double xThree = 0;
     double yThree = 0;
      double area = sum*(sum-sideOne)(sum-sideTwo)(sum-sideThree);
    
     
  
        
        System.out.print("Enter X1 point of the triangle: ");
        xOne = input.nextInt(); 
         System.out.print("Enter Y1 point of the triangle: ");
        yOne = input.nextInt(); 
        
          System.out.print("Enter X2 point of the triangle: ");
        xTwo = input.nextInt(); 
         System.out.print("Enter Y2 point of the triangle: ");
        yTwo  = input.nextInt(); 
        
          System.out.print("Enter X3 point of the triangle: ");
        xThree = input.nextInt(); 
         System.out.print("Enter Y3 point of the triangle: ");
        yThree = input.nextInt(); 
        
        
        sum = (sideOne + sideTwo +sideThree) / 2;
        
         System.out.printf("Sum of Sides: %.2f%n",sum);
        
      
       
     
       
       
       
     }  
           
         }
