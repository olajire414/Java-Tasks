import java.util.Scanner;
public class PaymentRate{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter hours worked: ");
    double h = input.nextDouble();
    
    System.out.print("Enter Hourly Rate: ");
    double r = input.nextDouble();
    
    System.out.print("Enter Bonus: ");
    double b = input.nextDouble();
    
    System.out.print("Enter Tax Rate: ");
    double t = input.nextDouble();
   
    double  grossPay= (h*r) + b; 
    
    double taxAmount = grossPay * (t/100);
    
    double netPay = grossPay -taxAmount ;
    
    

System.out.printf("GrossPay is: %.2f%n",grossPay);
System.out.printf("TaxAmount is: %.2f%n",taxAmount);
System.out.printf("NetPayis: %.2f%n",netPay);

}


}
