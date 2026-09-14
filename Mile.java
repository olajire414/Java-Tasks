import java.util.Scanner;
public class Mile{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter distance in miles: ");
    double mile= input.nextDouble();
    
    
    double  kilometer = mile * 1.60934;
    
    System.out.println("Mile is: " + mile);
    System.out.println("kilometer is: " + kilometer);
     
    
    
    



}


}
