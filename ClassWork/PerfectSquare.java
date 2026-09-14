import java.util.Scanner;
public class PerfectSquare{ 
        public static int perfectSquare(int number){
        Scanner input = new Scanner(System.in);
            System.out.println("Enter integer to get prime sum");

                int number1 = input.nextInt();

                    int sum = 0;

                    for(int count = 1; count<= number; count++){ 

                            
                            if (number % 1 == 0){
                                sum += count;
                                    number = number/count;                       
     
}
}
                            return sum;

}

            public static void main (String [] args){

            int sumResult = perfectSquare(1);
            System.out.println(sumResult);

}

}


