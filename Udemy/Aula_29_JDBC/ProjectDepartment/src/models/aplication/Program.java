package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.aplication;

import java.util.Scanner;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.view.Menu;


public class Program {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Menu.showMainMenu();
       
        scanner.close();
    }

}
