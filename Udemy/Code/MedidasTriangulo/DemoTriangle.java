package Udemy.Code.MedidasTriangulo;

import java.util.Scanner;

public class DemoTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three the measures of triangle X: ");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();

        ClasseTriangulo triangleX = new ClasseTriangulo(sideA, sideB, sideC);
        double areaTriangleX = triangleX.calculateAreaOfTriangle();

        System.out.printf("Area of triangle X: %.4f%n", areaTriangleX);
        scanner.close();

    
    }
    
}
