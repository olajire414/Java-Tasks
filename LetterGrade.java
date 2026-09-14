/** Question 23
pseudocode
1. import scanner 
2. initialize variable type in to collect input from user
3. use if else to set condition to apportion grade
4. println for output*/


import java.util.Scanner;
public class LetterGrade{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter Score between 1 - 100 for grade");

    System.out.print("Enter score : ");
    
    int score = input.nextInt();
    

    
    if(  score >= 90  ){ 
        System.out.println( "A");
    }
     else if( score >= 80 ){
       System.out.println( "B");
    }
     else if( score >= 70  ){
       System.out.println( "C");
    }
     else if( score >= 60){
       System.out.println( "D");
    }
     else if( score <60 ){
       System.out.println( "F");
    }
    
    
    
    
    
     
     }
    
    


}



