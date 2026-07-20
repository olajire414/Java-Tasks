import java.util.Scanner;
public class AreaPerimeterOfTriangle{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("Side A Of Right Angle Triangle: ");
    double a = input.nextDouble();
    
    System.out.print("Side B Of Right AngleTriangle: ");
    double b = input.nextDouble();
    
    System.out.print("Side C Of Right Angle Triangle: ");
    double c = input.nextDouble();
    
    double area = 1* b * a/2;
    
    double perimeter = a + b + c;
    
    
    

System.out.printf("Area in cm squared is: %.2f%n", area);
System.out.printf("Perimeter in cm  is: %.2f%n", perimeter);

}


}
