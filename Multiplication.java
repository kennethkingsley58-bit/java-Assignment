 import java.util.Scanner;

        public class Multiplication{
            public static void main(String[] args){


                Scanner input = new Scanner(System.in);

                 System.out.println("Enter your digitOne: ");
                    int digitOne = input.nextInt();

                 System.out.println("Enter your digitTwo: ");
                    int digitTwo = input.nextInt();

                int triple = digitOne + 3;
                int doubled = digitTwo * 2;
                int result = triple % doubled;

            System.out.println(result);
  }
}
