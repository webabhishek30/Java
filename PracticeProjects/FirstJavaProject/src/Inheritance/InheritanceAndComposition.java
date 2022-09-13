package Inheritance;
/*
    fragile - कोमल, दुर्बल, फुसफुसहा, भंगुर, भुरभुरा, मुलायम, सुकुमार, कमज़ोर, नाज़ुक, सहज में टूट जाने वाला, चुरचुरा, चुरमुरा

*   List the examples/situations where you would use composition over inheritance. Also, mention why you would do so.
*
*   -   Use inheritance only when the subclass is a proper subtype of the superclass. For example, ResearchStudent is a type of Student;
*       hence, ResearchStudent will have an is-a relationship with the Student class. If some methods in the superclass are necessary,
*       mandatory, or can be reused for its subclasses, use inheritance. On the other hand, use composition when you wish to use only
*       some functionalities or characteristics of the class that you are creating a has-a relationship for. In the case of a
*       Student class and a BankAccount class, you can say that a Student has-a Bank Account; hence, the has-a relationship holds true
*       here.
*
    Inheritance VS Composition

    -   Use Inheritance
        1. When the subclass is a proper subtype of a superclass.
        2. If some methods of a superclass are necessary for the subclass to implement.

    -   Use Composition
        1. When you wish to use only some of the functionalities of the class being created.


*   Some reasons to use composition over inheritance are:-
*
*       1. One reason for favouring Composition over Inheritance in Java is fact that Java doesn't support multiple inheritance.
*       2. Though both Composition and Inheritance allows you to reuse code, one of the disadvantages of Inheritance is that it
*          breaks encapsulation. If the subclass is depending on superclass behaviour for its operation, it suddenly becomes fragile.
*          When the behaviour of superclass changes, functionality in the subclass may get broken, without any change on its part.
*       3. Composition offers better test-ability of a class than Inheritance. If one class is composed of another class, you can
           easily create a Mock Object representing the composed class for sake of testing.
*       4. Like, There are many more reasons to favour Composition over inheritance
*
* */


public class InheritanceAndComposition {
}
