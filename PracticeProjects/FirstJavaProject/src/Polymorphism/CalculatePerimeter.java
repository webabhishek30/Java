package Polymorphism;

public class CalculatePerimeter {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(25, 25);

        rc.area();

        Square sq = new Square(25, 25);

        sq.area();
        sq.perimeter();
    }
}
class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String area() {
        return "Area of Rectangle is: " +  (width * height);
    }

    public String perimeter() {
        return "Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) );
    }
}

class Square extends Rectangle {

    Square(double width, double height) {
        super(width, height);
    }

    public String area(){
        return "Area of Square is : " + super.area();
    }
    public String perimeter(){
        return "Perimeter of Square is : " + super.perimeter();
    }
}

