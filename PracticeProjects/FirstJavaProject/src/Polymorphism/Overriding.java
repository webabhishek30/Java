package Polymorphism;

public class Overriding {
    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();

        poly.compute(24);
    }
}
class Calculate {
    public void compute(int num) {
        System.out.println("Square of the number is = " +(num*num));
    }
}

class Polymorphism extends Calculate {

    // override method from superclass here
    public void compute(int num) {
        System.out.println("Square root of the number is = " + Math.sqrt(num));
    }
}