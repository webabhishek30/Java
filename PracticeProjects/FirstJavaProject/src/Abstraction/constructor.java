//package Abstraction;
///*
//    While create an object of class then java creates a default constructor, but if you defined your own constructor java will not
//    define any default constructor, and will get compile error if we didn't pass any parameter inside the constructor.
//    To resolve this issue, we can create our own default constructor with no parameter.
//
//    DEFAULT VALUES OF DATATYPE :-
//
//    INT = 0;
//    FLOAT = 0.0f;
//    DOUBLE = 0.0d;
//    STRING = null;
//
//    Parameterised constructor: A constructor that has parameters is known as a parameterised constructor. A parameterised constructor is
//    used to assign different values to the instance variables of distinct objects.
//
//    Default constructor: A constructor that has no parameter and does nothing apart from creating a new object is known as a default
//    constructor. It is a method that need not be declared if there is no parameterised constructor, or you can declare it and leave it
//    empty in case of a declaration of any other parameterised constructor. Default constructors assign default values to the instance
//    variables of the objects depending on the type, for example, 0, null, etc.
//
//*/
//
//
//public class constructor {
//    public static void main(String[] args) {
//        Student c1 = new Student("Karan", 15234, 8.8);
//        c1.displayProfile();
//        System.out.println(c1.findPercentage());
//    }
//}
//
//class Student{
//    public String name;
//    public int rollNo;
//    public double cgpa;
//
//    /* DEFAULT CONSTRUCTOR */
//    public Student(){
//
//    }
//
//
//    /* PARAMETERISED CONSTRUCTOR */
//    public Student(String studentName, int studentRollNo, double studentGrade){
//        name = studentName;
//        rollNo = studentRollNo;
//        cgpa = studentGrade;
//
//        /* CLASS ATTRIBUTE = CONSTRUCTOR PARAMETER */
//    }
//
//    public void displayProfile(){
//        System.out.println(name + " " + rollNo + " " + cgpa);
//    }
//
//    public double findPercentage(){
//        return cgpa * 100;
//    }
//}
