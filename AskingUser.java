import java.util.Scanner;
    public class AskingUser{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int sum = 0;
    int counter = 0;
    int number = 0;
    
    while(number != -1){
    System.out.print("Enter number: entre -1 to quit the program: ");
    number = input.nextInt();
    
    sum = sum + number;
    counter++;
     
    } 
    
    System.out.printf("Average of number inputed by user is: %d%n",sum/counter );
    
    
    }

}
