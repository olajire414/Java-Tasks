/** Question 13
The aim is to calculate the grand total
1. import scanner 
2. initialize variables of type double to collect input
3. initialize 3 variables of type double to hold values
4. println to print output*/



import java.util.Scanner;
public class Cashier{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter price: ");
    double price = input.nextDouble();
    
    System.out.print("Enter Quantity: ");
    double quantity = input.nextDouble();
    
    
    double subTotal = price * quantity;
    
    double vat = subTotal * 0.20;
    
    double grandTotal= subTotal + vat;
    
    
    
    
    
    System.out.println("Grand total is: " + grandTotal);
     
    
    
    



}


}
