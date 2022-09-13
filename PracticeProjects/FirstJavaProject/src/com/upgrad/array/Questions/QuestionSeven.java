package com.upgrad.array.Questions;

import java.util.ArrayList;

public class QuestionSeven {
    public static void main(String[] args) {
        ArrayList<String> shape = new ArrayList<String>();
        shape.add("Square");
        shape.add("Triangle");
        shape.add(2, "Circle");
        shape.add(1, "Rhombus");
        System.out.println(shape.get(2));
    }
}
