package Inheritance;

public class Cappuccino extends Coffee
{
    public static void main(String args[])
    {
        Cappuccino c = new Cappuccino();
        c.order();
    }
}
class Coffee
{
    protected void order()
    {
        System.out.println("Coffee");
    }
}
