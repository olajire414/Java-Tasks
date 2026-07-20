/** Question 26
pseudocode
1. import scanner
2. initialize int variable to collect age
3. use if else to set condition
*/

import java.util.Scanner;
public class PersonAge{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter integer: ");
    
    int age = input.nextInt();
    

    
    if(  age <= 13){ 
        System.out.println( "Child");
    }
     else if( age <= 17 ){
       System.out.println( "Teenager");
    }
   
      else if( age <= 64){
       System.out.println( "Adult");
    }
    
     else if ( age > 65){
       System.out.println( "Senior");
    }
     
     }
    
    


}



