import java.util.Scanner;
  public class PrepThree {
    public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);
     
     int secondLargest = 0;
     int Largest = 0;

        int counter = 1;
      
      while ( counter <= 9 ){
      
      System.out.print("Enter integer: ");
      number = input.nextInt();
      counter++
      
      
      if( number > largest){ 
      secondLargest = largest;
      largest = number;
      
         } 
      if( number <largest && number > secondLargest){ 
          secondLargest = number;
         }
         
      
      if ( number > largest){
           largest = number;
      
                } 
                  
                }
         
      System.out.printf( "  Second largest: %d%n Largest numbers are: %d%n",secondLargest,largest
       );  
          
        
      
      
       
      
      
     
      
    }
    
    }
    
