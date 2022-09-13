package Encapsulation;

/*
    ACCESS MODIFIER

    Access modifier is specially designed to write safe code. Safe from any kind of misuse either accidentally or intentionally.

    There are four type of access modifier in java.

    * PRIVATE *
    When you declare a variable as private in a class, it signifies that it can be accessed throughout the class but not outside of it.
    You can’t access it from another class. When a method is declared private, it cannot be accessed by creating an object outside the
    class. It is restricted only to the class that contains it.

    Why Private?

    -   To prevent direct access from unrelated classes and hence avoid corruption of important data.

    * PUBLIC *
    When you declare a variable or a method as public in a class, it signifies that it can be accessed throughout the class.
    You can access these variables and methods from other classes as well. When a method of a class is declared as public, it can be
    accessed by creating an object of its class in other classes. If it is a static method, then you can directly access it using
    className.method() without creating an instance.

    - Protected
    - Default

    What change do you think happens when you change the type of any variable from public to private?
    - On declaring any variable as private, you cannot read or assign any new value to that variable from outside the class
    in which that attribute is declared. It basically restricts the access of that variable from outside the class.

    Why Public?

    -   If the member variables or methods are to be declared as final and need to be available to all the classes.


    * PROTECTED *

    Why Protected?

    -   To allow subclasses have direct access to some important characteristics or behaviour of super class.
    -   Protected member are not directly accessible outside the class.

*/

public class privateAccessModifier {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(10);
        int totalPrice = ticket.calculateCost(100);
        System.out.println(totalPrice);
    }
}

class MovieTicket {
    private int singleTicketCost;

    public MovieTicket(int singleTicketCost) {
        this.singleTicketCost = singleTicketCost;
    }

    public int calculateCost(int quantity) {
        return quantity * singleTicketCost;
    }
}