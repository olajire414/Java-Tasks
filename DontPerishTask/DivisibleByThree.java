public class DivisibleByThree{

public static boolean divisible (int number){

if (number % 3 == 0){ 
return true;

}
else {
return false;
}

}


public static void main(String[] args){

boolean divisibleResult = divisible(5);

System.out.println(divisibleResult);
}


}
