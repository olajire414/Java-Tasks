import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Principal: ");
    double p = input.nextDouble();
    
    System.out.print("Enter Rate: ");
    double r = input.nextDouble();
    
    System.out.print("Enter Time: ");
    double t = input.nextDouble();
   
    double simpleInterest = (p*r*t)/100; 
    
    double totalAmount = p + simpleInterest;
    

System.out.printf("Simple Interest is: %.2f%n", simpleInterest);
System.out.printf("Total Amount is: %.2f%n", totalAmount);

}


}
