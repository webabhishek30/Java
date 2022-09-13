public class classAndObject {
    public static void main(String[] args) {
        System.out.println(Circle.circumference(10f));
    }
}
class Circle {
    public static float circumference(float radius) {
        return 2f * 3.14f * radius;
    }
}
