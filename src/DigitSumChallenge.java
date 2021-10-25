import java.util.Scanner;
/*
Write a method with the name sumDigits that has one int parameter called number.
 */


public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer:");
        int digits = in.nextInt();
        System.out.println("the sum is" + sumDigits(digits));
    }
    public static int sumDigits(long number){
        int result = 0;
        while (number > 0 ){
            result += number%10;
            number /= 10;
        }
        return result;
    }



}
