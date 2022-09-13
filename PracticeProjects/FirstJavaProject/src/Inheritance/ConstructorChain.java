package Inheritance;

/*  In the given code, the statement ‘super()’ in the Shape class constructor will execute the constructor for which class?
*
* The line ‘super()’ is a call to the default constructor of the Object class that acts as the default superclass for the Shape class.
* Remember, a class that does not have a superclass, acts as the subclass of the Object class by default.
*
*
*
* */

public class ConstructorChain {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq);
    }
}
//class Shape {
//    public Shape() {
//        System.out.println("inside Shape class default constructor");
//    }
//}
//
//class Rectangle extends Shape {
//    public Rectangle() {
//        System.out.println("inside Rectangle class default constructor");
//    }
//}
//
//class Square extends Rectangle {
//    public Square() {
//        System.out.println("inside Square class default constructor");
//    }
//}

class Shape {
    public Shape() {
        super();
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super();
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square extends Rectangle {
    public Square() {
        super();
        System.out.println("inside Square class default constructor");
    }
}
