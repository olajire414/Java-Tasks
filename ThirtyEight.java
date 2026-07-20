import java.util.Scanner;
public class ThirtyEight{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    
    int number = 0;
 
    do {System.out.printf("Checkout Menu: or -1 to quit:%n Jollof rice%n Beans%n Porrage%n Roasted Yam%n",number);
    
       number = input.nextInt();
       
        }
        while(number != -1);
        
  
}

}
