package com.Excercises.cwh.ExcerciseOne;

import java.util.Scanner;

public class CalculateNumbers {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        int num1, num2, num3, sum;

        System.out.println("Calculation of numbers:-");

        System.out.println("Enter the first number");
        num1 = numberInput.nextInt();

        System.out.println("Enter the second number");
        num2 = numberInput.nextInt();

        System.out.println("Enter the third number");
        num3 = numberInput.nextInt();

        sum = num1 + num2 + num3;

        System.out.println("The sum of all the numbers are :- " + sum);

    }
}
