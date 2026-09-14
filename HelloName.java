/** Question 2

 Pseudocode: the aim of this program is to read student's name and age
 1. import scanner
 2. collect student name input from user
 3. initialize string variable  to  collect name
 4. initialize int variable to collect age
 5. use println for output
 
 */ 



import java.util.Scanner;
    public class HelloName{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Enter Name: ");
    String name = input.nextLine();
    
    System.out.print("Enter Age: ");
    int age = input.nextInt();
    
    System.out.println(" Hello  " + name + " You are " + age + " Old");
        
  
}

}
