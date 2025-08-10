package Udemy.Code.Array_arraylist;

import java.util.Scanner;

public class DemoDatePerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        while (true) {
            System.out.print("Enter the quantity of persons not negative: ");
            quantity = scanner.nextInt();
            if (quantity > 0) {
                break;
            }
        }

        double average = 0.0;
        double sum = 0.0;
        int size = 0;
        int quantityMan = 0;


        DatePerson vector[] = new DatePerson[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.println(" ---> Person n" + (i + 1) + ": <---");
            System.out.print("Heigt: ");
            double height = scanner.nextDouble();
            String gender;

            while (true) {
            System.out.print("Gender (m/f): ");
            gender = scanner.next().toLowerCase();
            if (gender.equals("f") || gender.equals("m")) {
                break;
            }
        }
            vector[i] = new DatePerson(height, gender);

        }

    
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getGender().equals("f")) {
                sum += vector[i].getHeight();
                size++;
            } else {
                quantityMan++;
            }
        }

        if (sum > 0) {
            average = sum / size;
            System.out.println("Media da altura das mulhres: " + average);
        } else{
            System.out.println("Nenhuma mulher cadastrada!");
        }

        if (quantityMan > 0) {
            System.out.println("Quantidade de Homens: " + quantityMan);
        }

        

        scanner.close();
    }



}
