import java.util.Scanner;
public class GreetHello{
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter name: ");
    String name = input.nextLine();
    
    System.out.println("Hello!" + name);
    
    
    }
}
