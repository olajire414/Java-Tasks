import java.util.Scanner;
public class GreaterNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter integer: ");
    
    int numberOne = input.nextInt();
    
    
    System.out.print("Enter integer: ");
    
    int numberTwo = input.nextInt();
    

    
    if(  numberOne > numberTwo){ 
        System.out.println( "Number One is Largest" );
    }
     else  if( numberTwo > numberOne) {
       System.out.println( "Number One Smallest");
    }
   
      else  if ( numberOne == numberTwo){
       System.out.println( "Equal");
    }
    
    
     
     }
    
    


}



