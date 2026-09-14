import java.util.Scanner;
    public class CountDown{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
 
    System.out.print("Enter number: ");
    int counter = input.nextInt();
  
    for( counter= 0; counter>=0; counter--){
    
     System.out.println(counter);
   
    System.out.println("Blastoff");
    
    }

}
    }
