import java.util.Scanner;
    
    public class Circle{
        public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
       
    System.out.print("Enter Radius: ");
       int radius = input.nextInt();   

       int diameter = 2 * radius;
       double circumference = 2 * 3.14159 * radius;
       double area = 3.14159 * radius;

    System.out.printf("Diameter = %d%n", diameter);
    System.out.printf("circumference = %f%n", circumference);
    System.out.printf("Area = %f%n", area);
   }
 }         

