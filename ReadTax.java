import java.util.Scanner;
public class ReadTax{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Price: ");
    double price = input.nextDouble();
     double tax = price * 0.075;
     double total = price + tax;
     
      System.out.print("Total Price: " + total);
      System.out.println();
      
    
    
    
    
    



}


}
