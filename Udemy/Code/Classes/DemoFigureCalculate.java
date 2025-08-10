package Udemy.Code.Classes;

import java.util.Scanner;

public class DemoFigureCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width and height of the figure:");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();


        FigureCalculate rectangle = new FigureCalculate(width, height);
        System.out.println(rectangle);

        scanner.close();
    }
}
