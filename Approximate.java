public class Approximate{
 public static void main(String[]args){
   
   double pi = 4*(1.0-0.33+0.2-0.14+0.11-0.09);
   System.out.printf("Pi value is: %.2f%n",pi);
   
   double piTwo = 4*(1.0-0.33+0.2-0.14+0.11-0.09+0.08);
   System.out.printf("Pi value is: %.2f%n",piTwo);
 }

}
