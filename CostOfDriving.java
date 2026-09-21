  import java.util.Scanner;

        public class CostOfDriving{
            public static void main(String[] args){


             Scanner input = new Scanner(System.in);
        
               System.out.println("Enter the distance: ");
               double distance = input.nextInt();

                System.out.println("Enter the miles per gallon: ");
               double miesPerGallon = input.nextInt();

                System.out.println("Enter the prices per gallon: ");
               double pricePerGallon = input.nextInt();

                    double cost = (distance / milesPerGallon * pricePerGallon);

                    System.out.printn("The cost od Driving is; " cost);

  }
}

