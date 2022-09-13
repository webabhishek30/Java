package com.upgrad.array.Questions;

import java.util.*;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }
    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
        boolean available = false;
        for(int number : arr){
            if(number == k){
                available = true;
                break;
            }

        }
        System.out.println(available);
    }
}
