import java.util.Scanner;
public class ThirtyNine{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    
    int grade = 0;
 
    do {System.out.printf("Enter Grade: or -1 to quit: ",grade);
    
       grade = input.nextInt();
       
        }
        while(grade != -1);
        
  
}

}
