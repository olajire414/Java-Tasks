import java.util.Scanner;
public class ReadInteger { 
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a numbers between 0 to 1000: ");
    

    int number = input.nextInt();

    int number1 = number % 10;
    number = number / 10;

    int number2 = number % 10;
    int number / 10;

    int number3 = number % 10;
    int number / 10;

    int sum = number1 + number2 + number3;
// 2.6 pseudocode: prompt a user to enter a number that has three digits from the example and use the number three times with
// a placeholder and select the last number then the last number and sum all the three last numbers and print the output
    
 System.out.print("The total sum of the numbers is: " + sum);

}

}
