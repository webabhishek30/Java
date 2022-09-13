package com.Excercises.cwh.ExcerciseOne;
import java.util.Scanner;

public class CbsePercentageCalculator {
    public static void main(String[] args) {

        String studentName;
        int studentRoll;
        byte marksInMath; byte marksInEnglish; byte marksInSST; byte marksInScience; byte marksInHindi;
        String message = "Please enter marks below or equal to 100";

        Scanner marksInput = new Scanner(System.in);
        System.out.println("Please enter the name of the Student");
        studentName = marksInput.next();
        System.out.println("Please enter the rollno of the Student");
        studentRoll = marksInput.nextInt();

        System.out.println("Please enter the marks in math");
        marksInMath = marksInput.nextByte();
        if(marksInMath > 100){
            System.out.println(message);
            marksInMath = marksInput.nextByte();
        }

        System.out.println("Please enter the marks in english");
        marksInEnglish = marksInput.nextByte();
        if(marksInEnglish > 100){
            System.out.println(message);
            marksInEnglish = marksInput.nextByte();
        }

        System.out.println("Please enter the marks in SST");
        marksInSST = marksInput.nextByte();
        if(marksInSST > 100){
            System.out.println(message);
            marksInSST = marksInput.nextByte();
        }

        System.out.println("Please enter the marks in Science");
        marksInScience = marksInput.nextByte();
        if(marksInScience > 100){
            System.out.println(message);
            marksInScience = marksInput.nextByte();
        }

        System.out.println("Please enter the marks in hindi");
        marksInHindi = marksInput.nextByte();
        if(marksInHindi > 100){
            System.out.println(message);
            marksInHindi = marksInput.nextByte();
        }

        int calculateMarks = marksInMath + marksInEnglish + marksInSST + marksInScience + marksInHindi;

        float marksPercentage = (float)(calculateMarks * 100) / 500;

        System.out.println("Student name : " + studentName + "\n" + "Student rollno : " + studentRoll + "\n" + "CBSE Percentage : " + marksPercentage);


    }



}

