package Abstraction;

public class classesAndObjects {
    /*
        OBJECT ORIENTED PROGRAMMING LANGUAGES
        C++, C#, JAVA, PYTHON, etc

        Benefits of classes and objects :-

        1. Building a new project becomes more organised and efficient.
        2. Real-world scenarios can be implemented naturally.
        3. Modification and update of program becomes easier.


        *Notes :- We can use only one public class inside a file. Because java need only one public class to be there and that public
        class name should be the same as file name. All the other classes in that file are not defined as public. If we use the public
        as prefix inside any other classes it would give the compilation error (class 'className' is public, should be declared in the
        file name 'Classname.java')

        *Notes :- Static attributes and static methods belongs to particular class while non-static member belongs to object or instance
        of that class.


     */

    public static float radius = 10.0f;

    public static void main(String[] args) {
        /*
        System.out.println("area of circle : " + Circle.area(radius));
        System.out.println("area of circle : " + Square.area(radius));
         */

        /*
            OBJECT CREATION MECHANISM OUTPUT
         */
        Circle c1 = new Circle();
        c1.radius = 10.0f;
        System.out.println("area of circle : " + c1.area());

        Square s1 = new Square();
        s1.length = 15.3f;
        System.out.println("area of square : " + s1.area());
    }
}

/* MODULE CREATION MECHANISM
class Circle{
    public static float area(float radius){
        return 3.141f * radius * radius;
    }
}

class Square{
    public static float area(float length){
        return length * length;
    }
}
*/
/* OBJECT CREATION MECHANISM */

class Circle{
    public float radius;
    public float area(){
        return 3.141f * radius * radius;
    }
}

class Square{
    public float length;
    public float area(){
        return length * length;
    }
}