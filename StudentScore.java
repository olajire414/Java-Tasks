/**
Question 39
1. import scanner 
2. intialize variable of type int to collect input
3. use if statements to set conditon
*/

import java.util.Scanner;
public class StudentScore{
    public static void main( String[] args){
    Scanner input = new Scanner(System.in);  
       
    System.out.print("Enter Score: ");
  
    int score = input.nextInt();
    
    if(score >=90){ System.out.print ("A" );
    
    }
    else if(score >=80){System.out.print("B");
    
    }
    else if(score>=70 ){System.out.print("C");
    
    }
  else if(score >= 60){System.out.print("D");
    
    }
    else if(score < 60){System.out.print("F");
    
    }
    
    
    
}
}
