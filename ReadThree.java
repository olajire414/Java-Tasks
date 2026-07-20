/**


*/





import java.util.Scanner;
public class ReadThree{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

 System.out.print("Enter only integers: ");

    System.out.print("Enter first number: ");
    int firstNumber= input.nextInt();
    
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
    
     System.out.print("Enter third number: ");
    int thirdNumber = input.nextInt();
    
    
    if(firstNumber > secondNumber && firstNumber > thirdNumber){ System.out.print("first number is largest: " + firstNumber);
    
    }
     
      if(secondNumber > firstNumber && secondNumber > thirdNumber){ System.out.print("second number is largest: "+ secondNumber);
    
    }
     
      if(thirdNumber > firstNumber && thirdNumber > secondNumber){ System.out.print("thirdnumber is largest: "+ thirdNumber);
    
    }
    
    
    



}


}
