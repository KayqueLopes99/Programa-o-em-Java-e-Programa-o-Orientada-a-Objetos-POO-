package Udemy.Code.Interfacess.aplication;

import java.util.Scanner;

import Udemy.Code.Interfacess.src.models.entities.CarRental;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRental.registerCarRental(scanner);
        scanner.close();
    }
}
