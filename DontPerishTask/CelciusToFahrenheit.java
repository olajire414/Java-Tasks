public class CelciusToFahrenheit{

public static double celcius(double c){

double celcius = (c * 9/5) + 32 ;
return celcius;
}


public static void main(String[] args){

double celciusResult = celcius(24.4);

System.out.println(celciusResult);
}


}
