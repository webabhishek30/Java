//package Polymorphism;
///*  ABSTRACT CLASS
//    1.  Partially implemented class
//    2.  May have abstract methods - methods that only have a declaration and no definition.
//*
//*   Ques:- If a non-abstract class inherits from an abstract class, it may not provide definitions for all the abstract methods.
//*   Ans:-  If a class inherits an abstract class, then it must provide an implementation for all the abstract methods; otherwise,
//*          the inheriting class should also be declared as abstract.
//*
//*   Notes:-
//*
//*   1.  Abstract method of an abstract class must be defined in its subclass.
//*   2.  If the subclass does not provide definition for the abstract methods, then the subclass has to be declared abstract too.
//*
//*   1.  Abstract class can not be instantiated.
//*   2.  Abstract class can only be subclassed.
//*   3.  The subclass must provide implementations for all the abstract methods in order to be a non-abstract class.
//*
//*   Which of the following statement(s) is(are) true with respect to abstract classes in Java?
//*   1. An abstract class is the one that is not used to create objects.
//*   2. An abstract class is designed only to act as a base class to be inherited by other classes.
//*
//*   Both 1 and 2
//*   An instance of an abstract class cannot be created, we can have references of abstract class type though. Abstract data class is not
//*   used to create objects in Java, and it is designed only to act as a base class to be inherited by other classes.
//** */
////public class Abstract {
////    public static void main(String[] args) {
////        Student s1 = new ArtsStudent();
////        Person p1 = new Person();
////
////        ArtsStudent a1 = new Student();
////
////        Employee e1 = new Student();
////
////    }
////}
////abstract class Person {
////    // some code here
////}
////
////class Employee extends Person {
////    // some code here
////}
////
////class Student extends Person {
////    // some code here
////}
////
////class ArtsStudent extends Student {
////    // some code here
////}
//abstract class demo
//{
//    public int a;
//    demo()
//    {
//        a = 10;
//    }
//
//    abstract public void set(int a);
//
//    abstract final public void get();
//
//}
//
//class Test extends demo
//{
//
//    public void set(int a)
//    {
//        this.a = a;
//    }
//
//    final public void get()
//    {
//        System.out.println("a = " + a);
//    }
//
//    public static void main(String[] args)
//    {
//        Test obj = new Test();
//        obj.set(2);
//        obj.get();
//    }
//}