package com.upgrad.array.Questions;
import java.util.ArrayList;

/*
*   Searching for an Element in ArrayList
    What will the output of the following segment of code be?

    ArrayList<Float> random = new ArrayList<Float>();
    random.add(2f);
    random.add(4f);
    random.add(5f);
    random.add(10f);
    random.add(99.9f);

    System.out.println(random.contains(5.0));
* */

public class QuestionEight {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        System.out.println(random.contains(5.0));
    }
}
