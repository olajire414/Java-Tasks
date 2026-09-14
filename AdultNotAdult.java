import java.util.Scanner;
public class AdultNotAdult{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);  
       
    System.out.print("Enter name: ");
  
    String name  = input.nextLine();
    
    System.out.print("Enter age: ");
    int age = input.nextInt();
    
    if(age >= 18){ System.out.print ("Adult" );
    
    }
    else if(age <= 17 ){System.out.print("Underage");
    
    }
  
}
}
