package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utilities {

    public static Scanner scanner = new Scanner(System.in);

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("\n".repeat(50));
        }
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
                System.out.print(prompt + ": ");
            }
        }
    }

    public static String readLettersAndSpaces(String prompt) {
        while (true) {
            String input = scanner.nextLine().trim();

            if (input.matches("[A-Za-zÀ-ÿ ]+") && input.replaceAll("[^A-Za-zÀ-ÿ]", "").length() >= 2) {
                return input;
            }

            System.out.println("Please enter only letters and spaces (at least two letters)!");
            System.out.print(prompt + ": ");
        }
    }

    public static LocalDate readDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print("Enter the date (DD/MM/YYYY): ");
            String input = scanner.nextLine().trim();

            try {
                return LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date! Correct format: DD/MM/YYYY.");
            }
        }
    }

    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static boolean validateEmail(String email) {
        return email.matches("^[\\w](\\.?[\\w-])*@(gmail|hotmail)\\.com(\\.br)?$");
    }

    public static double readDouble() {
        while (true) {
            try {
                String input = scanner.nextLine().trim().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!\nEnter the value again: ");
            }
        }
    }
}
