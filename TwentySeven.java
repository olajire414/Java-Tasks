   
   import java.util.Scanner;
    public class TwentySeven{
        public static void main(String[] args){
        
         Scanner input = new Scanner (System.in);
         
         int counter = 0;
        
          System.out.print("Enter first integer : ");
          
          int largest = input.nextInt();
          
        
         while (counter >= 1 ){ 
            System.out.print("enter next Integer : ");
            
            int nextInteger = input.nextInt();
             counter = counter + 1;
             
          if(largest < nextInteger)
             { System.out.printf("Largest value: %d%n",nextInteger);}
           
            
          }
         
        
          
         
         
         
         
        }
    
    
    
    }
