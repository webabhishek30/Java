package Inheritance;

public class computeFee {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek", 2);
        System.out.println(s1.getDetails());

        ResearchStudent s2 = new ResearchStudent("Abhishek", 2, "Software Engineering");
        System.out.println(s2.getDetails());
    }
}

class Student {
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student (String name, int year) {
        this.name = name;
        this.year= year;
    }
    public String getDetails() {
        return "Name : " + name;
    }
    public int computeFees() {
        return this.annualFees * this.year ;
    }
}

class ResearchStudent {
    private final String name;
    private int year;
    private static final int annualFees = 10000;
    String researchArea;

    public ResearchStudent (String name, int year, String researchArea) {
        this.name = name;
        this.year= year;
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return "Name : " + name + "\n" + "Fee : " + this.computeFees() + "\n" + "ResearchArea : " + this.researchArea;
    }

    public int computeFees( ) {
        return this.annualFees * this.year ;
    }
}