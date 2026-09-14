/**
1. Invoke Scanner to enable input collection
2. initialize 4 variables to count grades A,B,C,D.
3.initialize 1 variable to count invalid input
4.invoke the For loop
5. start the For loop with a starting point of 
    1 and end point of <=5
 6. Collect input of grade and name
 7. right inside the For loop invoke switch to compare input 
 and count the grade input
 8. use println to print grade summary and the invalid input

*/


import java.util.Scanner;   
  public class StudentGrade{
    public static void main(String[] args){
 
     int gradeACount = 0;
     int gradeBCount = 0;
     int gradeCCount = 0;
     int gradeDCount = 0;
     int gradeFCount = 0;
     
     int invalid = 0;
     
     
     Scanner input = new Scanner(System.in);
     
  for(int number = 1; number<= 5; number++){
  
  System.out.print("Enter number of  student: ");
  int studentNumber = input.nextInt();
  
   System.out.print("Enter student name: ");
  String name = input.nextLine();
  input.nextLine();
  
  
  System.out.print("Enter student score: ");
  int score = input.nextInt();
  
 
  switch(score){
        (score>=80) 
  case 80: System.out.println("Excellent");break;
  }
  case 60: System.out.println("Very good");break;
  
  case 40:System.out.println("Excellent");break;
  
  case 20:System.out.println("Excellent");break;
  
  case 10:System.out.println("Excellent");break;
  
  default :  ++invalid; System.out.println("invalid input");
  break;
  }
  
}
//System.out.println("--------------Grade summary-------------");
//System.out.println("Number of 80's: " + gradeACount + " Excellent");
//System.out.println("Number of 60's: " + gradeBCount +" Very good");
//System.out.println("Number of 40's: " + gradeCCount + " Good");
//System.out.println("Number of 20's: " + gradeDCount + " Poor");
//System.out.println("Number of 10's: " + gradeFCount + " Very Poor");
//System.out.println("Number of invalid input: " + invalid);
//
//


}
}
