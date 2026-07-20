import java.util.Scanner;
public class CostPerUnit{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Unit Consumed : ");
    double unit = input.nextDouble();
    
    System.out.print("Enter Cost Per Unit: ");
    double cost = input.nextDouble();
   
   
    double totalBill = unit * cost; 
    
    

System.out.printf("Total Bill For Electricity is: %.2f%n", totalBill);

}


}
