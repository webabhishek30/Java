package com.Excercises.cwh.ExcerciseOne;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        long km;
        float convertToMiles;

        Scanner kmInput = new Scanner(System.in);

        System.out.println("We are converting the Kilometer into Miles :- ");
        System.out.println("Please enter the KM which you want to convert in miles :- ");

        km = kmInput.nextLong();

        convertToMiles = (float)(km * 0.621371);

        System.out.println(km + " KM = " + convertToMiles + " Miles");
    }
}
