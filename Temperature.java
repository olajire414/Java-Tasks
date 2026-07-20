import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Temperature in Celcius: ");
    double c = input.nextDouble();
    
 
    double fahrenheit = (c * 9/5) + 32;
    

System.out.printf("Temperature in Fahrenheit is: %.2f%n", fahrenheit);


}


}
