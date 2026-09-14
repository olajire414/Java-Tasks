/**Question 10
Pseudocode
The aim is to print a formatted profile that reads age name year of birth
1. import scanner
2. declare 2 string variable to collect input from user
3. declare int variable to collect input for year
4. declare int variable to minus year from 2025
5. printf to print*/



import java.util.Scanner;
public class ComputeAge{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter firstname: ");
    String firstName = input.nextLine();
    
    System.out.print("Enter Lastname: ");
    String lastName = input.nextLine();
    
    System.out.print("Enter year of birth: ");
    int year = input.nextInt();
    
    int age = 2025 - year ;
    
  
    
    
    
    System.out.printf(" Age %d%n",age );
     
    
    
    
    



}


}
