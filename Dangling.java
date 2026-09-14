/** Question 40
Pseudocode


*/







import java.util.Scanner;
public class Dangling{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter income amount: ");
    double income = input.nextDouble();
    
    double incomeOne = income * 0;
    double incomeTwo = income * 0.07;
    double incomeThree = income *0.15 ;
    
   
    if(  income <= 300000 ){ 
        System.out.println( "tax owed is #" + incomeOne );
    }
    
    else if (income<= 600000 ){ 
        System.out.println( "tax owed is #" + incomeTwo );
    }
     
     else if( income > 600000 ){ 
        System.out.println( "tax  owed is #" + incomeThree );
    }
    
   System.out.println( "dangling else problem is when you ommit braces in a program  java throws java 32 error, reached end of file while parsing, to fix it locate the missing brace and add brace" );


}


}
