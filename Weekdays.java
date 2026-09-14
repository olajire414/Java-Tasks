import java.util.Scanner;
public class Weekdays{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);  
       
    System.out.print("Enter number between 1 - 7 ");
  
    int  number = input.nextInt();
    
    if(number == 1){ System.out.print ("it is Monday" );
    
    }
    else if(number == 2){System.out.print("it is Tuesdat");
    
    }
    else if(number == 3){System.out.print("It is Wednesday");
    
    }
  else if(number == 4){System.out.print("It is Thursday");
    
    }
    else if(number == 5){System.out.print("It is Friday");
    
    }
    else if(number == 6) {System.out.print("It is Saturday");
    
    }
    else if(number == 7 ){System.out.print("It is Sunday" );
    
    
}
}
}
