package Udemy.Code.Exceptions.Reservations;

import java.util.Scanner;

public class DemoReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation.registerReservation(scanner);
        scanner.close();
    }
}
