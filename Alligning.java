    import java.util.Scanner;

        public class Alligning{
            public static void main(String[] args){


             Scanner input = new Scanner(System.in);
        
               System.out.println("input digitOne: ");
                int digitOne = input.nextInt();

                System.out.println("input digitTwo: ");
                 int digitTwo = input.nextInt();

                System.out.println("input digitThree: ");
                 int digitThree = input.nextInt();

                System.out.println("input digitFour: ");
                 int digitFour = input.nextInt();

                System.out.println("input digitFive: ");
                 int digitFive = input.nextInt();

                
            int largest = digitOne;
            int smallest = digitOne;

    if(digitTwo > largest){
        largest = digitTwo;
    }
    
    if(digitThree > largest){
        largest = digitThree;
    }

    if(digitFour > largest){
        largest = digitFour;
    }

    if(digitFive > largest){
        largest = digitFive;
    }

     if(digitTwo < smallest){
        smallest = digitTwo;    
    }  
     if(digitThree < smallest){
        smallest = digitThree;
    } 
     if(digitFour < smallest){
        smallest = digitFour;
    }
     if(digitFive < smallest){
        smallest = digitFive;
    }

        System.out.println("Largest: " + largest);
        System.out.println("Smalllest: " + smallest);
  }
}
