package variableDatatypeII;

import java.util.Scanner;

public class variableDatatypeQuestions {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        //Write your code here
        //You can import the scanner class as discussed in the videos

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a, b, c");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println(a*b+c);
    }
}
