import java.util.Scanner;
public class Bmi{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Weight In Kg: ");
    double w = input.nextDouble();
    
    System.out.print("Enter Height in M: ");
    double h = input.nextDouble();
   
   
    double bmi = w / (h*h); 
    
    

System.out.printf("BMI is: %.2f%n", bmi);

}


}
