//package PracticeQuestionInterfaces;
//
//
//import java.util.*;
//
//class Number {
//    //Write your code here
//    protected double complex;
//    protected double imaginary;
//    public Number(double complex, double imaginary){
//        this.complex = complex;
//        this.imaginary = imaginary;
//    }
//    public Number(){};
//
//
//    public double getImaginaryPart() {
//        return imaginary;//Write your code here
//    }
//    public double getComplex(){
//        return complex;
//    }
//
//}
//
//class Complex extends Number {
//    public void checkComplex(double complex){
//        System.out.println(complex);
//    }
////Write your code here
//}
//
//class PurelyImaginary extends Complex {
//
////Write your code here
//}
//
//public class NumberQuestion {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
//        System.out.println(num.getImaginaryPart());
//        num.checkComplex();
//        num.checkPurelyImaginaryNumber();
//
//    }
//}
//
//
