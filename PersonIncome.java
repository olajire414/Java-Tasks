import java.util.Scanner;
public class PersonIncome{
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
    
   


}


}
