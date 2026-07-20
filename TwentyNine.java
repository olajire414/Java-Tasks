 
  public class TwentyNine {
    public static void main(String[] args) {
    
        
        
   
        System.out.print("Number without miultiple of six: ");
        int number = 0;
        int container= 0;
        
        
        while (number <= 100) {
        
        if( number % 6 != 0){
        container = number;
        }
         
        
        
        number++;
        System.out.printf("%d: ",container );
       
     
         
        }
         System.out.println();
          
        
      
    }
}
