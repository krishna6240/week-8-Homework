import java.util.Scanner;

public class Pro5 {
    /*
    Write a method called isPalindrome with one int parameter called number.
     */


    public static void main(String[] args) {

        System.out.println("Please enter an integer. ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean Final = NumberPalindrome.isPalindrome(number);
        System.out.println(Final);

    }

    public static int reverse(int number) { // missing return?
        int y = 0;
        int n;
        for (n = 0; n <= number; n++) { // parameters
            y = number % 10; // remainder
            number = number / 10; // gets rid of last digit
            n = n * 10 + y; // sets reverse values

            return n; // returns reversed number
        }
        return y;
    }


    public static class NumberPalindrome {
        public static boolean isPalindrome(int number) {
            int temp = number;
            int reverse = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10;
                reverse = reverse + lastDigit;
                number = number / 10;
            }
            if (temp == reverse) {
                return true;
            } else {
                return false;
            }
        }

    }
}
