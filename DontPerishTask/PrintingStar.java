public class PrintingStar{

public static int printingStar(int n){

for(int count = 1; count <= n; count++ ){
System.out.println("*");
}
//return n;
}


public static void main(String[] args){

int nResult = printingStar(5);

System.out.println(nResult);
}


}
