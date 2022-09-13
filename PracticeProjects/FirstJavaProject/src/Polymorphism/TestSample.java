package Polymorphism;

class Sum {
    void addition(int num1, int num2){
        System.out.println("Sum of two numbers ="+(num1+num2));
    }
    void addition(int num1, int num2,int num3){
        System.out.println("Sum of three numbers ="+(num1+num2+num3));
    }
}
public class TestSample {
    public static void main(String args[]){
        Sum obj = new Sum();
        obj.addition(20,30);
        obj.addition(20,30,40);
    }
}
