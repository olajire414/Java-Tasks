import java.util.Scanner;

    public class SumOfPrimeFactor{

        public static int number(int number){
        Scanner input = new Scanner(System.in);
            System.out.println("Enter integer to get prime sum");

                int number1 = input.nextInt();

                    int total = 0;

                    for(int count = 2; count<= number1; count++){ 

                            
                            if (number1 % count == 0){
                                total += count;
                                    number = number/count;

                        
     
}
}
                            return total;

}



            public static void main (String [] args){

            int totalResult = number(1);
            System.out.println(totalResult);

}

}


