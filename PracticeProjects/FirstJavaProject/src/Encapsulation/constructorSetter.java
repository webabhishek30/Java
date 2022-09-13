package Encapsulation;
/*  CONSTRUCTOR AND SETTER
*   Difference between CONSTRUCTOR & SETTER
*   while writing syntax both are quietly similar to each other but there are some difference between them.
*
*   Constructor syntax :-
*
*   public Circle(float radius){
*       this.radius = radius;
*   }
*
*   Setter syntax :-
*
*   public void setRadius(float radius){
*       if(radius >= 0f){
*           this.radius = radius;
*       }
*   }
*
*
*   CONSTRUCTOR :-
*   1. Always called at the beginning of the lifetime of an object.
*   2. Use the setters for its own benefits.
*   3. Constructor are automatically called as soon as the object is being created.
*   4. No return type (void, int, string etc.) is mentioned in the case of the constructors.
*
*   SETTER :-
*   1. Called at any point of time during lifetime of an object.
*   2. Security Mechanisms / Attribute constraints build into it.
*   3. Setter method can be called after the object is created, for example, when you want to set/modify the value of any instance
*      variable.
*   4. Different constraints for the value of variables can be added to the setter methods. You can also call the setter method from the
*      constructor if you want to place constraint on the values of the instance variables of the class while creating a new object.
*
*   Example:-
*
*   class Demo {
*      private int var;         //just declaring a private int variable
*
*   public Demo(int var) {       //declaring parameterised setter method
*          setVar(var);
*      }
*
*      public void setVar(int var) {     //declaring setter method
*          this.var = var;
*          if (this.var < 0){                 //adding constraint
*             this.var = 0;
*          }
*      }
*   }
*
*  */


public class constructorSetter {
    public static void main(String[] args) {
        Demo d = new Demo(5);
    }
}
class Demo {
    private int var;

    public Demo(int var) {
        this.var = var;
    }

    private void setVar(int var) {
        this.var = var;
    }
}