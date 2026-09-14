import java.util.Scanner;
public class EvenOdd{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter integer: ");
    
    int number = input.nextInt();
    

    
    if(  number % 2 == 0){ 
        System.out.println( "even");
    }
     else if( number % 2 == 1){
       System.out.println( "odd");
    }
     
     }
    
    


}



