  import java.util.Scanner;

    public class Division{
        public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter digit: ");
            int digit = input.nextInt();
    
        if(digit % 3 == 0){
            System.out.println("This digit is divisible by 3");
        }
        
        if(digit % 3 != 0){
            System.out.println("This digit is not divisibe by 3");    
    }
  }
}
