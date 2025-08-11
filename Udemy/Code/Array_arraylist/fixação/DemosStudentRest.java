package Udemy.Code.Array_arraylist.fixação;

import java.util.Scanner;

public class DemosStudentRest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityRooms;
        while (true) {
            System.out.print("How many rooms will be rented?");
            quantityRooms = scanner.nextInt();
            if (quantityRooms > 0) {
                break;
            }
        }

        StudentRent vector[] = new StudentRent[quantityRooms];

        for (int i = 0; i < quantityRooms; i++) {
            System.out.println(" ---> Student #" + (i + 1) + ": <---");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            int room;
            while (true) {
                System.out.print("Room: ");
                room = scanner.nextInt();

                if (room >= 0 && room < vector.length) {
                    break;
                } else {
                    System.out.println("Número inválido, tente novamente.");
                }
            }

            vector[i] = new StudentRent(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < quantityRooms; i++) {
            if (vector[i] != null) {
                System.out.println(i + ": " + vector[i]);
            }
        }

        scanner.close();
    }

}
