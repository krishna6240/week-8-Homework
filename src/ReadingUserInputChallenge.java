import java.util.Scanner;
/*
Read 10 numbers from the console entered by the user and print the sum of those
numbers.
 */

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum=0,num;
        int i=0;
        System.out.println("Enter number:");
        Scanner scan =new Scanner(System.in);
        while(i<=10){
            num = scan.nextInt();
            sum=sum+num;
            i++;
            if(i>10) {
                System.out.println("Invalid number:");
            }
            System.out.println("sum="+sum);
            }
        scan.close();
        }
    }

