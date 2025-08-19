package Udemy.Code.Interfacess.exemple.aplication;

import java.util.Scanner;

import Udemy.Code.Interfacess.exemple.src.models.entities.CarRental;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRental.registerCarRental(scanner);
        scanner.close();
    }
}
