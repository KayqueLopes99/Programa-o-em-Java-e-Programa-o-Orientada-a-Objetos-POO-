package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class HeightsVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of persons: ");
        int quantity;
        while (true) {
            System.out.print("Enter the quantity of persons not negative: ");
            quantity = scanner.nextInt();
            if (quantity > 0) {
                break;
            }
        }
        Person vector[] = new Person[quantity];
        double porcentageAge = 0.0;
        double averageHeight = 0.0;
        double sum = 0.0;

        

        for (int i = 0; i < vector.length; i++) {
            System.out.println(" ---> Person n" + (i + 1) + ": <---");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            vector[i] = new Person(name, age, height);
            sum += vector[i].getHeight();

        }

        System.out.println("Person under 16:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getAge() < 16) {
                porcentageAge++;
                System.out.println(vector[i]);
            }

        }

        if (porcentageAge == 0) {
            System.out.println("No corresponding person.");
        } else {
            porcentageAge = (porcentageAge / vector.length) * 100.0;
            System.out.printf("Porcentage the people with smaller of sixteen age old: %.1f%%\n", porcentageAge);
        }

        averageHeight = sum / vector.length;

        System.out.println("Average height: " + averageHeight);

        scanner.close();
    }
}
