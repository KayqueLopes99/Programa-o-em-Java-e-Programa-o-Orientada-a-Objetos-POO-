package Udemy.Code.CalculatorStatic;

public abstract class Calculator {
    private static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    public static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }




}
