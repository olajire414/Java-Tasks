import java.util.Scanner;
public class Forty{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Number: ");
    int number = input.nextInt();
  
 
    do {
   
        System.out.print("Enter Number: ");
       number = input.nextInt();
       
     sum += number;
        System.out.printf("the total is: %d%n", sum);
        }
        
        
        
        while(number != -1);
       
        
  
}

}
