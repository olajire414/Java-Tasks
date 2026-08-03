import java.util.Scanner;
public class BackToSenderLogistics{
public static void main(String[] args){ 
Scanner input = new Scanner(System.in);

System.out.println("Back to sender logistics");

System.out.print("enter number of percel delivered:  ");

int numberOfPercel= input.nextInt();

if ( numberOfPercel<50){ 
    System.out.println("Payment is: " + (150 * numberOfPercel +5000));
}

else if (numberOfPercel > 50 || numberOfPercel <= 60){ 
    System.out.println( "Payment is: " + (200 * numberOfPercel +5000));
}

else if (numberOfPercel > 60 || numberOfPercel <= 70 ){ 
    System.out.println("Payment is: " + (250 * numberOfPercel +5000));
}

else if (numberOfPercel > 70 ){ 
     System.out.println( "Payment is: " + (500 * numberOfPercel +5000));
}

else{ System.out.println("invalid input");
}



}
}
