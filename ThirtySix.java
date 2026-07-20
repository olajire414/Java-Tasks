import java.util.Scanner;
public class ThirtySix{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    
    int number = 0;
 
    do {System.out.printf("Enter positive number: or -1 to quit: ");
    
       number = input.nextInt();
       
        }
        while(number != -1);
  
}

}
