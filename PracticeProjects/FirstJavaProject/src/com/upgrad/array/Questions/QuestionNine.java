package com.upgrad.array.Questions;

import java.util.ArrayList;

/*
*   Operations on an ArrayList
    Description
    Given below is the code of ArrayList, which contains an object named ‘random’ with five elements: 2, 4, 5, 10, and 99.9
    stored as float-type values. Can you use add and remove methods to replace the fourth element (10) with 15?

    Sample Input:
    There is no input for this program.

    Expected Output:
    2.0
    4.0
    5.0
    15.0
    99.9
* */
public class QuestionNine {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();

        random.add(0, 2f);
        random.add(1, 4f);
        random.add(2, 5f);
        random.add(3, 10f);
        random.add(4, 99.9f);

        random.remove(3);
        random.add(3, 15f);

        printList(random);
    }

    public static void printList(ArrayList<Float> floatingNumbers){
        for(Float numbers : floatingNumbers){
            System.out.println(numbers);
        }
    }
}
