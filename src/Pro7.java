public class Pro7 {
    public static int sumFirstAndLastDigit(int number)//to add first and last
//digits of a given interger
    {
        int firstdigit=0;
        int lastdigit=0;

        if(number>=0 && number<=9)
        {
            return number+number;
        }

        else if(number>9)
        {
            lastdigit=number%10;
            while(number>=10)
            {
                number/=10;
                if(number<=9 & number>=0){
                    firstdigit=number;
                }

            }
            return firstdigit+lastdigit;
        }
        else
            return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(sumFirstAndLastDigit(345));
    }
}

