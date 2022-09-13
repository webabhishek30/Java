package Polymorphism;
/* Interface
*   -   An interface is like an abstract class, but all methods in an interface must be abstract.
*
* ABSTRACT CLASSES vs INTERFACES
*
*   1.  Use abstract class:
*       -   if we are sure about class hierarchy
*       -   If we wish to share some common code amongst classes but also let them have their own implementations of common methods.
*       -   When we wish to create multiple instances of common class.
*
*   2.  Use Interface:
*       -   When we want the subclasses to implement some mandatory behaviour defined in a method.
*       -   When we want to implement some characteristic behaviour from multiple sources.
*
*
*   From Java 8 onwards, interfaces too can consist of non-abstract methods (concrete methods) that are of the static and default types.
*
*   An interface is a collection of abstract methods and constant class variables, i.e. final static fields.
*   Since Shape does not have any concrete parts to it now, it can be represented in the form of an interface as shown below:

        public interface Shape {
           // abstract methods
           abstract float area();
           abstract float perimeter();
        }
*
*   The syntax to use the Shape interface in a program is as follows:

        public class Rectangle implements Shape {
           // class definition for Rectangle
        }
*
*   Just like an abstract class, an interface cannot be instantiated. Java allows a class to implement more than one interface.
*   The syntax for implementing more than one interface is

    public class MyClass implements Interface1, Interface2, Interface3…
*
*
*   Also, as you know, Java does not allow a class to extend multiple classes, but an interface can extend multiple interfaces.
*   The syntax for extending multiple interfaces is

    public interface MyInterface extends Interface1, Interface2, Interface3…
*
*   You need to use the extends keyword once, followed by the comma-separated list of interfaces that you wish to extend.
*
* */

public class Interface {
}
