package Encapsulation;
/*
    * SETTER METHOD *
    - Setter methods are used to set a new value to private variables, or modify their values from outside the class in which they are
    declared. The standard way in which a private variable can be declared along with

    Example:-

    class Demo {
       private int var;      //just declaring a private int variable

       public void setVar(int var) {
           this.var = var;
       }
    }
*/

public class setterMethod {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.setName("Ankit");
    }
}
class Person2 {
    private String name;
    public String getName() {
        return name;
    }

    // Declare a setter method here

    public void setName(String name) {
        this.name = name;
    }
}