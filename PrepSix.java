import java.util.Scanner;
  public class PrepFive {
    public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);
     
     int smallest = 0;
     int secondSmallest = 0;
     int total = 0;
     
      System.out.print("Enter integer: ");
      int number = input.nextInt();
      secondSmallest = number;

        int counter = 0;
      
      while ( counter <= 9 ){
      
      System.out.print("Enter integer: ");
      number = input.nextInt();
      total = total + number;
       
            if( number < secondSmallest){ 
                smallest = number;
               }
            if (number > secondSmallest && number < smallest){
                smallest = secondSmallest;
                secondSmallest = number;  
            }
              counter++;
        }
System.out.printf( "smallest:%d%n secondSmallest:%d%n",smallest,secondSmallest);
System.out.printf( "Total Average: %d%n",total/10);
    
      
      
      
          
       
        
    
      
       
      
      
     
      
    }
    
    }
    
