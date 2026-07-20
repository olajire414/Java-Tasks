
/** Question 27
Pseudocode
1. import scanner
2. initialize int variable to collect input
3. use if else to compare the inputs an print */



import java.util.Scanner;
    public class CompareInteger{
    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
    
       System.out.println( "Enter number" );
       
       int numberOne = input.nextInt();
    
    
       System.out.println( "Enter number");
       
       int numberTwo = input.nextInt();
    
    
    if(  numberOne > numberTwo){ 
        System.out.println( "Largest number is number one " + numberOne);
    }
     else if (numberOne < numberTwo  ){
       System.out.println( "Smallest number is number one " + numberOne);
    }
     
     else if (numberTwo > numberOne){
       System.out.println( "Largest number is numberTwo "+ numberTwo);
    }
    
    else if (numberTwo < numberOne){
       System.out.println( "smalllest number is number Two "+ numberTwo);
    }
    else if (numberTwo == numberOne){
       System.out.println( "Two numbers are equal "  );
    }
     
     }
    
    


}



