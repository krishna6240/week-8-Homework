import java.util.Scanner;
/*
Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
 */

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean hasmax = false;
        boolean hasmin = false;

        while (true){
            System.out.println("Enter number:");
            if(in.hasNextInt()){
                int input = in.nextInt();
                if(input > max || !hasmax) {
                    max = input;
                    hasmin = true;
                }
                if(input > min || !hasmin) {
                    min = input;
                    hasmin = true;
                }

            }else {
                System.out.println("min = " + max);
                System.out.println("max = " + min);
                break;
            }
        }

     in.close();
        }
    }