package GodCreation;

public class GodCreation {
    public static void main(String[] args) {
        Dog dog = new Dog(4);
        System.out.println(dog.legs);
    }
}

// LIVING THING
class LivingThing{
    int legs;

    public LivingThing(int legs){
        this.legs = legs;
    }
}

class Dog extends LivingThing{

    public Dog(int legs) {
        super(legs);
    }
}