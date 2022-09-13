package Polymorphism;

public class Overloading {
    public static void main(String args[])
    {
        Addition obj = new Addition();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
    }
}

class Addition
{
    int add(int a, int b)
    {
        return a+b;
    }
    int  add(int a, int b, int c)
    {
        return a+b+c;
    }
}
