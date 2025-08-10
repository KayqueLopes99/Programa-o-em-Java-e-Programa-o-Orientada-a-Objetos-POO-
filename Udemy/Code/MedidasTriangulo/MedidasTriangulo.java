package Udemy.Code.MedidasTriangulo;

import java.util.Scanner;

public class MedidasTriangulo {
    public static void main(String[] args) {

        double triangleSideAx, triangleSideBx, triangleSideCx, triangleSideAy, triangleSideBy, triangleSideCy;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three the measures of triangle X: ");
        triangleSideAx = scanner.nextDouble();
        triangleSideBx = scanner.nextDouble();
        triangleSideCx = scanner.nextDouble();

        System.out.println("Enter three the measures of triangle Y: ");
        triangleSideAy = scanner.nextDouble();
        triangleSideBy = scanner.nextDouble();
        triangleSideCy = scanner.nextDouble();

        double px = (triangleSideAx + triangleSideBx + triangleSideCx) / 2;
        double areaTriangleX = Math.sqrt(px * (px - triangleSideAx) * (px - triangleSideBx) * (px - triangleSideCx));

        double py = (triangleSideAy + triangleSideBy + triangleSideCy) / 2;
        double areaTriangleY = Math.sqrt(py * (py - triangleSideAy) * (py - triangleSideBy) * (py - triangleSideCy));

        System.out.printf("Area of triangle X: %.4f%n", areaTriangleX);
        System.out.printf("Area of triangle Y: %.4f%n", areaTriangleY);

        if (areaTriangleX > areaTriangleY) {
            System.out.println("The area the triangle X is large. ");
            
        } else if (areaTriangleX == areaTriangleY) {
            System.out.println("The area the triangle X and Y do are equals.");
        }else{
            System.out.println("The area the triangle Y is large.");
        }

        scanner.close();
        }
}