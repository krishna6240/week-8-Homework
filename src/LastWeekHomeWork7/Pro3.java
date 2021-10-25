package LastWeekHomeWork7;

import java.util.Scanner;

public class Pro3 {
    int Maths, English, Science, sum, roll, pass, Total, Grade1;
    float percent;
    String name, Grade;
    double div;

    public void Grade() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your roll_number:");
        roll = scan.nextInt();
        System.out.println("Enter your English mark:");
        English = scan.nextInt();
        System.out.println("Enter your Science mark:");
        Science = scan.nextInt();
        System.out.println("Enter your Maths mark:");
        Maths = scan.nextInt();
        sum = (English + Science + Maths);
        percent = sum * 100 / 300;


        if (percent >= 80) {
            Grade = "A+";
            System.out.println("Grade A+");
        } else if (percent >= 60) {
            Grade = "A";
            System.out.println("Grade A");
        } else if (percent >= 50) {
            Grade = "B";
            System.out.println("Grade B");
        } else if (percent >= 35) {
            Grade = "PASS";
            System.out.println("Grade C");
        } else
            Grade = "FAIL";
        System.out.println("FAIL");
    }


    public void Display() {

        System.out.println("------------------------------");
        System.out.println("     Mark Sheet               ");
        System.out.println("------------------------------");
        System.out.println("Name     : " + "   krishna     ");
        System.out.println("Roll No :  " + roll + "       ");
        System.out.println("------------------------------");
        System.out.println("    Subjects :  " + "    Marks");
        System.out.println("------------------------------");
        System.out.println("    Maths    :   " + Maths + "");
        System.out.println("    Science   :  " + Science + "");
        System.out.println("    English :  " + English + " ");
        System.out.println("------------------------------");
        System.out.println("    Total   :  " + sum + "");
        System.out.println("------------------------------");
        System.out.println("   Percentage    : " + percent + "");
        System.out.println("   Grade         : " + Grade + "");


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Pro3 obj = new Pro3();
        obj.Grade();
        obj.Display();
    }


}



