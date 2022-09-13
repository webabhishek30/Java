package com.upgrad.array.Questions;
import java.util.*;
/*
* Reverse the ArrayList
    Description
    You are given an unsorted Array List with n integers. You need to reverse the Array List.

    Example:
    array List = [5, 8, 2, 15, 6, 25, 1, 11, 13]
    Output:
    array List = [13, 11, 1, 25, 6, 15, 2, 8, 5]

    array List = [9, 3, 14, 22, 1, -6, 18, 15]
    Output:
    array List = [15, 18, -6, 1, 22, 14, 3, 9]

    Input: The input will be in the following format :
    The first line should be the number of elements in the Array List.
    The second line should be the elements of the Array List space separated.
    Note: You just need to reverse the given Array List and need not to print anything. The stub code will print the elements of the array.

    Example :
    Input:
    9
    5 8 2 15 6 25 1 11 13
*
* */
public class QuestionSix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());

        for (int i = 0; i < list.size(); i++) break;
        reverseArrayList(list, n);
    }
    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list, int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = list.get(i);
            j = j - 1;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + " ");

        }

    }
}
