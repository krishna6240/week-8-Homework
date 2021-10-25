import java.util.Scanner;

public class Pro12 {

        public static void primeNumber(int num) {
            boolean isDevided = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    isDevided = true;
                    break;
                }
            }

            if (!isDevided)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            primeNumber(num);

        }

    }
