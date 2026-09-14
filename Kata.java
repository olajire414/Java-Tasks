
public class Kata{

public static void main(String[] args){

 System.out.println(isEven(10));


System.out.println(isPrime(15));

int checkSubtract = subtractNumber(21,22);
System.out.println(checkSubtract);

float checkDivision = division(10,2);
System.out.println(checkDivision);


factorOf(10);

System.out.println();

System.out.println(isSquare(25));

System.out.println(isPallindrome(12321));

System.out.println(factorialOf(10));

System.out.println(squareOf(5));



    
}

//Question Number 1
public static boolean isEven(int number){
   
  if ( number % 2 == 0){
    return true;
}
   else{

return false;
}


}

//Question Number 2

public static  boolean isPrime(int number){
   int prime = number % 2;
  if ( number % 2 == 1){
return true;
}
   else{
return false;
  }
}

//Question Number 3

public static  int subtractNumber(int number1, int number2){
   int subtract = number1 - number2;
  if ( number2 > number1){
subtract = subtract * -1;
}
   else{System.out.print(subtract);
}

return subtract;
}

//Question Number 4

public static  float division(int number1, int number2){
   int div = number1 / number2;
  if ( number2 == 0){div = 0;
}
  
return div;
}

//Question Number 5

public static  void factorOf(int number){
   int factor = 1;

   for(factor =1; factor <= number; ){
if (number % factor == 0){
 System.out.print(factor + " ");
                 }
    factor++;
}

return;
}


//Question Number 6

public static  boolean isSquare(int number){
   
if (number < 0){
    return false;
}

int squareroot = (int) Math.sqrt(number);

return (squareroot * squareroot == number);

}




















//Question Number 7

public static  boolean isPallindrome(int number){
   
     if(number < 0){
        return false;      }

     int enteredInteger = number;
     int reversedOfEnteredInteger = 0;
     while(number != 0){
        int digit = number % 10;
        reversedOfEnteredInteger =  reversedOfEnteredInteger * 10 + digit;
        number /= 10;
}
return enteredInteger == reversedOfEnteredInteger ;
 
}

//Question Number 8


public static  long factorialOf(int number){
     int product = 1;

for(int factor = number; factor >= 1; factor -- ){
    product *= factor;  
}

return product; 

 }   

//Question Number 9

public static  long squareOf(int number){
     int square = number * number;


return square; 

 }   


}
