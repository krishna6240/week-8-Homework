public class Pro13 {
    public static void hasSharedDigit(int number1, int number2) {
        boolean answer;
        if (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99) {//condition to enter betwwen 10 to 99
            if ((number1 / 10) == (number2 / 10) || (number1 / 10) == (number2 % 10) || (number1 % 10) == (number2 / 10) || (number1 % 10) == (number2 % 10))//shared digit logic
            {
                answer = true;
                System.out.println(answer);
            }

        } else {
            answer = false;
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);

    }
}


