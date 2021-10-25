import java.util.Scanner;
/*
Write a program to input any number and check if it Armstrong number or not
 */

public class Pro10 {
    public static void main(String[] args) {
        int num,number,temp,total=0;
        System.out.println("Enter 3 digit Number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;
        for(;number!=0;number/=10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;

        }
        if(total == num)
            System.out.println(num + "is an Armstrong number");
        else
            System.out.println(num + "is not Armstrong number");
    }
}
