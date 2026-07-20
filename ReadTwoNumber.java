import java.util.Scanner;
public class ReadTwoNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int firstNumber = input.nextInt();
    
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
    
    int sum = firstNumber + secondNumber;
    
    int difference = firstNumber - secondNumber;
    
    int product = firstNumber * secondNumber;
    
    int quotient= firstNumber / secondNumber;
    
    
    
    System.out.println("sum of the two numbers: " + sum);
     System.out.println("difference of the two numbers: " + difference);
     System.out.println("product of the two numbers: " + product );
     System.out.println("quotient  of the two numbers: " + quotient);
    
    
    
    



}


}
