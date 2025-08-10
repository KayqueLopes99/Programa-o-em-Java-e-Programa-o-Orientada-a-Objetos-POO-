package Udemy.Code.CalculatorStatic;
import java.util.Scanner;

public class DemoCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = Calculator.circumference(radius);
        double area = Calculator.area(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Volume: %.2f%n", volume);

        scanner.close();
    }
}
