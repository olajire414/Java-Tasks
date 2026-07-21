public class AbsoluteNumber{

public static int absoluteNumber(int number){

if(number < 0){ 

return -number;

}

else{

return number;

}

}


public static void main(String[] args){

int numberResult = absoluteNumber(2);

System.out.println(numberResult);
}


}
