import java.util.Scanner;
    public class SmallestValue{
        public static void main(String[] args){
        
         Scanner input = new Scanner (System.in);
         
         int counter = 1;
        
          System.out.print("Enter first integer : ");
          
          int smallest = input.nextInt();
          
        
         while (counter <= 9){ 
            System.out.print("enter next Integer : ");
            
            int nextInteger = input.nextInt();
             counter = counter + 1;
             
          if(smallest < nextInteger)
             { System.out.printf("smallest value: %d%n",smallest);}
           
            
          }
         
        
          
         
         
         
         
        }
    
    
    
    }
