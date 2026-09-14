/** question 29
1. import scanner
2. declare four strings variables use to first two to collect input
3. initialize the remaining 2 to hold password and username
4. use if esle to set condition
5. println to print

*/


import java.util.Scanner;
public class PasswordUsername{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Enter Username: ");
    String username = input.nextLine();
    
     System.out.print("Enter Password: ");
    String password = input.nextLine();
    
    
    String admin = "Admin";
    String  adminTwo = "1234";
   
    if(  username == admin ){ 
        System.out.println( "Access granted");
    }
    
    else if ( username != admin){
     System.out.println("Access Denied");
    
    }
     
     else if(  password == adminTwo){ 
        System.out.println( "Access granted");
    }
    
    else if ( username != adminTwo){
     System.out.println("Access Denied");
    
    }
     
    
    



}


}
