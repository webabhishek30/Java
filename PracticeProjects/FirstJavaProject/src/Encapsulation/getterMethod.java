package Encapsulation;
/*
    * GETTER METHOD *

    - To read the value of private attribute from outside the class. Doesn't allow to write or update the value of the private attribute.
    Type of this particular getMethod should be same as the private attribute.

    Example of GETTER METHOD
    class Demo {
       private int var = 5;      //assigning a value to the private int variable

       public int getVar() {
           return var;
       }
    }
*/


public class getterMethod {
    public static void main(String[] args) {
        Person p1 = new Person("Ankit");
        System.out.println(p1.getName());
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    // Declare a getter method here
    public String getName(){
        return this.name;
    }
}