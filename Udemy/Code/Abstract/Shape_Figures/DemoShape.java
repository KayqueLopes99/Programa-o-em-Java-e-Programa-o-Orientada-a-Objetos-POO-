package Udemy.Code.Abstract.Shape_Figures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> listShapes = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int quantityShapes = scanner.nextInt();

        for (int i = 0; i < quantityShapes; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Retangle or Circle (r/c): ");
            char ch = scanner.next().charAt(0);

            System.out.print("Color (BLACK, BLUE, RED, GREEN, YELLOW): ");
            Color color = Color.valueOf(scanner.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = scanner.nextDouble();

                System.out.print("Heigt: ");
                double height = scanner.nextDouble();

                listShapes.add(new Rectangle(color, width, height));

            } else if (ch == 'c') {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                listShapes.add(new Circle(color, radius));
                
            }
        }

        if (!listShapes.isEmpty()){
            System.out.println("SHAPE AREAS:");
            for (Shape shape : listShapes) {
                System.out.printf("%.2f\n", shape.area());
            }
        }

        scanner.close();
    }
}
