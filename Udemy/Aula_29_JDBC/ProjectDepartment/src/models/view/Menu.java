package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.view;

import java.util.Scanner;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Seller;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Department;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.utils.Utilities;


public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        int option;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Seller Menu");
            System.out.println("2 - Department Menu");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            option = Utilities.readInt("Choose an option");

            switch (option) {
                case 1:
                    showSellerMenu();
                    Utilities.clearScreen();
                    break;
                case 2:
                    showDepartmentMenu();
                    Utilities.clearScreen();
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    Utilities.clearScreen();
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }

        } while (option != 0);
        scanner.close();
    }

    private static void showSellerMenu() {
        int option;
        do {
            System.out.println("\n===== SELLER MANAGEMENT MENU =====");
            System.out.println("1 - Register a new seller");
            System.out.println("2 - View all sellers");
            System.out.println("3 - View a seller by ID");
            System.out.println("4 - View a sellers by department");
            System.out.println("5 - Update a seller");
            System.out.println("6 - Remove a seller");
            System.out.println("0 - Back to Main Menu");

            option = Utilities.readInt("Choose an option");

            switch (option) {
                case 1 -> Seller.registerSeller();
                case 2 -> Seller.viewAllDatas();
                case 3 -> Seller.viewDataSeller();
                case 4 -> Seller.findByDepartmentSellers();
                case 5 -> Seller.updateSeller();
                case 6 -> Seller.removeSeller();
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid option! Try again.");
            }
        } while (option != 0);
    }

    private static void showDepartmentMenu() {
        int option;
        do {
            System.out.println("\n===== DEPARTMENT MANAGEMENT MENU =====");
            System.out.println("1 - Register a new department");
            System.out.println("2 - View all departments");
            System.out.println("3 - View department by ID");
            System.out.println("4 - Update a department");
            System.out.println("5 - Remove a department");
            System.out.println("0 - Back to Main Menu");
            System.out.print("Choose an option: ");

            option = Utilities.readInt("Choose an option");

            switch (option) {
                case 1 -> Department.registerDepartment();
                case 2 -> Department.viewAllDepartments();
                case 3 -> Department.viewDepartmentById();
                case 4 -> Department.updateDepartment();
                case 5 -> Department.removeDepartment();
                case 0 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid option! Try again.");
            }
        } while (option != 0);
    }
}
