package Udemy.Code.Interfacess.src.models.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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

    public static LocalDateTime dateVerification(Scanner scanner, String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime date = null;

        while (date == null) {
            System.out.print(text + " date (DD/MM/YYYY HH:mm): ");
            String dateStr = scanner.nextLine();

            try {
                date = LocalDateTime.parse(dateStr, formatter);
                
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato DD/MM/YYYY HH:mm.");
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
}
