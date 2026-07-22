public class LargestOfTwoNumber{

public static int largest (int number1, int number2){

if (number1 > number2){ 
return number1;

}
else {
return number2;
}

}


public static void main(String[] args){

int largestResult = largest(1,3);

System.out.println(largestResult);
}


}
