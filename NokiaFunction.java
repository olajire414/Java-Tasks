
import java.util.Scanner; 
public class NokiaFunction{   
    public static void main(String... args){
	    Scanner input = new Scanner(System.in);
	    
	   	
		  
		    String mainMenu = """
		
 Mainmenu 

1.Phone book   
2.Messages
3.Chat
4.Call register
5.Tones
6.Settings
7.Call divert
8.Games
9.Calculator
10.Remainders
11.Clock
12.Profiles
13.SIM services

""";
System.out.println(mainMenu);
          
            int mainMenuFunctions = input.nextInt();	
            switch(mainMenuFunctions){
            case 1:System.out.print("""
                
       
                 Phone Book
1.Search
2.Service Nos.
3.Add name
4.Erase
5.Edit
6.Assign tone
7.Send b' card
8.OPtions
9.Speed dails
10.Voice tags

""");  
 break;
}
         
           
            int message = input.nextInt();	 
           switch(message){ 
           case 2: System.out.println("""
            
                 Message
1.Write message    			
2.Inbox
3.Outbox
4.Picture messages
5.Templates
6.Smileys
7.Message settings

            """);
           
         break;    
            
      }   
      
      
           
           
           
            int chat = input.nextInt();	 
           switch(chat){ 
           case 3:System.out.println("""
            
Chat

            """);
             break;
          }
          
           
           int callRegister = input.nextInt();	 
           switch(callRegister){        
           case 4 :System.out.println("""
           
Call register

1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
  1. Last call duration
  2. All calls’ duration
  3. Received calls’ duration
  4. Dialled calls’ duration
  5. Clear timers
6. Show call costs
  1. Last call cost
  2. All calls’ cost
  3. Clear counters
7. Call cost settings
  1. Call cost limit
  2. Show costs in
8. Prepaid credit
""");
 break;

      }      

           
          // break;
           int tones = input.nextInt();	 
            switch(tones){   
           case 5:System.out.println("""
Tones

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver
""");
 break;
}
  
      
      
       int callSetting = input.nextInt();	 
   
            switch(callSetting){
           
           case 6:System.out.println( """
           
1. Call settings
   1. Automatic redial
   2. Speed dialling
   3. Call waiting options
   4. Own number sending
   5. Phone line in use
   6. Automatic answer 1
2. Phone settings
   1. Language
   2. Cell info display
   3. Welcome note
   4. Network selection
   5. Lights2
   6. Confirm SIM service actions
3. Security settings
   1. PIN code request
   2. Call barring service
   3. Fixed dialling
   4. Closed user group
   5. Phone security
   6. Change access codes
4. Restore factory setting
""");
 break;
}
      
           
       
          
           int callDivert = input.nextInt();	 
            switch(callDivert){
           case 7:System.out.println("""
Call Divert

            """);
             break;
            }
            
          
           
       
            int game = input.nextInt();	 
            switch(game){   
           case 8:System.out.println( """
Games

            """);
             break;
            }
           
           
           
           
            int calculator = input.nextInt();	 
            switch(calculator){         
           case 9:System.out.print("""
Calculator

            """);
             break;
           
           }
           
          
          
          
           int reminder = input.nextInt();	 
            switch(reminder){
           case 10:System.out.println("""
Reminders

            """);
             break;
            }
            
                   
          
           
            int clock = input.nextInt();	 
            switch(clock){
           case 11:System.out.println("""
            
Clock

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time

            """);
             break;
            }
             
           
           
           
           
            int profile = input.nextInt();	 
            switch(profile){
           case 12:System.out.println("""
  Profiles

            """);
            break;
            }
           
           
           
           
            int sim = input.nextInt();	 
            switch(sim){
           case 13:System.out.println("""

            SIM services3

            """);
           break;
           }
           
          
           
            int close = input.nextInt();	 
            switch(close){
            case 0:System.out.println(mainMenu);
           
           
           }
           
             
           
           	

		
		
		
		
		
		
		
		
		}
		}
