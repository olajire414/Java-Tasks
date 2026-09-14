/** Question 31
pseudocode
1. impurt scanner
2. initialize variable type double to collect input
3. initialize 3 variables of type double to hold values for prices
4. invoke if else statement to set condition
5. println to print*/



import java.util.Scanner;
public class UtilityBill{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Utility units: ");
    double unit = input.nextDouble();
    
    double priceOne = unit * 50;
    double priceTwo = unit * 75;
    double priceThree = unit * 100;
    
   
    if(  unit <= 100 ){ 
        System.out.println( "Bill is #" + priceOne );
    }
    
    else if ( unit <= 300 ){ 
        System.out.println( "Bill is #" + priceTwo );
    }
     
     else if( unit > 300 ){ 
        System.out.println( "Bill is #" + priceThree );
    }
    
   


}


}
