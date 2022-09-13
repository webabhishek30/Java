package com.Excercises.cwh.ExcerciseOne;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        String name;
        Scanner nameInput = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = nameInput.next();

        System.out.println("Hello " + name + ", have a good day!");
    }
}
