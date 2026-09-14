public class ClassWorkOnMethod{

public static String message( ){

String welcome = "Welcome to java";
 return welcome;

}

public static int doubleIt(int n ){

int doub = n * 2 ;
return doub;
}

public static boolean isNegative(int n ){
if (n < 0){ 
return  true;
}

else {
return false;
}

}


public static int timeTable(int n ){

int counter = 0;

for (int count = 1; count <= 1000; count++){ 

if (count % n == 0){

if (counter == 5){
break;
}

System.out.print(count + ",");
counter++;

}

System.out.println();
}

}

public static int average(int a, int b, int c ){

int ave = (a + b + c) / 3 ;
return ave;
}

public static boolean isRange(int n, int low, int high ){
if (n > low && n < high){
return true;
}
else{
return false;
}

}


public static void main(String[] args){
String welcomeResult = message();
int doubResult = doubleIt(2);
boolean negResult = isNegative(2);
int tableResult = timeTable(2);
int aveResult = average(10,2,6);
boolean rangeResult = isRange(3,2,5);

System.out.println(welcomeResult);
System.out.println(doubResult);
System.out.println(negResult);
System.out.println(tableResult);
System.out.println(aveResult);
System.out.println(rangeResult);


}
}
