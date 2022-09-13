package Abstraction;

public class abstraction {
    public static float radius = 10.0f;

    // Method 1 to get the radius
    //    public static void main(String[] args) {
    //        System.out.println(3.141f * radius * radius);
    //    }


    // Method 2 to get the radius
    //{


    //}
    public static void main(String[] args) {
        System.out.println(area(radius));
    }

    public static float area(float radius){
        return 3.141f * radius * radius;
    }
//    public static void main(String[] args) {
//        System.out.println(findArea.area(radius));
//    }
}

// Function execute through class
//class findArea{
//    public static float area(float radius) {
//        return 3.14f * radius * radius;
//    }
//}

