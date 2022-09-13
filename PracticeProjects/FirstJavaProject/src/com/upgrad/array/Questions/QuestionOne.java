package com.upgrad.array.Questions;

public class QuestionOne {
    public static void main(String[] args) {
        int random[] = {2, 4, 5, 10};
        printArray(random);
    }
    public static void printArray(int[] arr){
        for(int numbers : arr){
            System.out.println(numbers);
        }
    }
}
