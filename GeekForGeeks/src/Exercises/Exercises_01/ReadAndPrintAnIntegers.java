package Exercises.Exercises_01;
import java.util.Scanner;

public class ReadAndPrintAnIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = scan.nextInt();

        System.out.println("You have entered : " + number);
    }
}
