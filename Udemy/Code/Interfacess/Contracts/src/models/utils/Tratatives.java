package Udemy.Code.Interfacess.Contracts.src.models.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratatives {
    public static String StringVerification(Scanner scanner, String text) {

        while (true) {
            System.out.print(text + ": ");

            String enter = scanner.nextLine().trim();

            if (enter.matches("[A-Za-zÀ-ÿ ]+") && enter.replaceAll("[^A-Za-zÀ-ÿ]", "").length() >= 2) {
                return enter;
            }

            System.out.println("Por favor, digite apenas letras e espaços (mínimo duas letras)!");
        }
    }

    public static LocalDate dateVerification(Scanner scanner, String text) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = null;

        while (date == null) {
            System.out.print(text + " date (DD/MM/YYYY): ");
            String dateStr = scanner.nextLine();

            try {
                date = LocalDate.parse(dateStr, formatter);
                
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato DD/MM/YYYY.");
            }
        }

        return date;
    }

    public static double doubleVerification(Scanner scanner, String text) {
        while (true) {
            try {
                System.out.print(text);
                String input = scanner.nextLine().trim().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
            }
        }
    }


    public static int intVerification(Scanner scanner, String text) {
        while (true) {
            try {
                System.out.print(text);
                int Number = scanner.nextInt();
                scanner.nextLine();

                if (Number <= 0) {
                    throw new IllegalArgumentException("O número do contrato deve ser maior que zero.");
                }


                return Number;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido!");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
