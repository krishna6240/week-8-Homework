import java.util.Locale;
import java.util.Scanner;
/*
Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input.
 */

public class Pro3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o")
                || input.equals("u");

        if (input.length() > 1) {
        } else if (vowels) {
            System.out.println("Input letter is vowel.");

        } else {
            System.out.println("Input letter is Consonant.");

        }

    }
}
