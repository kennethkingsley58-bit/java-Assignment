public class SumOfDigit{
    public static void main(String[] args){

        int number = 932
        int lastDigit = number % 10;

        number = number / 10;
        int secondDigit = number % 10;

        number = number % 10;
        int lastDigit = number % 10;

        int sum = firstDigit + secondDigit + lastDIgit;

        System.out.println("The sum of the integer is: " + sum);

  }  
}
