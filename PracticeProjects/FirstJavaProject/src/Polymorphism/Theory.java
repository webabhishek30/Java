package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Theory {
    public static void main(String[] args) {
        List<Scientist> team = new ArrayList<>();
        team.add(new Godel());
        team.add(new Tesla());

        System.out.println("Scientist list");
        for(Scientist scientist : team){
            scientist.printTheory();
        }
    }
}
class Scientist {
    private String theory = ("Science");
    public void printTheory() {
        System.out.println(theory);
    }
}
class Godel extends Scientist {
    private String theory = ("Mathematics");
    public void printTheory() {
        System.out.println(theory);
    }
}

class Tesla extends Scientist {
    private String theory = ("Physics");
    public void printTheory() {
        System.out.println(theory);
    }
}