package Udemy.Code.Exceptions.Reservations;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reservation {
    private int roomNumber;
    private LocalDate checkin;

    private LocalDate checkout;

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Reservation Room:" + roomNumber + ", Checkin: " + checkin + ", Checkout: " + checkout + " ,Days: "
                + duration() + ".";
    };

    public int duration() {
        return (int) ChronoUnit.DAYS.between(this.checkin, this.checkout);
    }

    public boolean updateDates(LocalDate newCheckin, LocalDate newCheckout) throws DomainException {
        if (newCheckin.isBefore(this.checkin) || newCheckout.isBefore(this.checkout)) {
            throw new DomainException("As datas de atualização devem ser futuras em relação à reserva atual!");
        }
        if (newCheckout.isBefore(newCheckin)) {
            throw new DomainException("Checkout não pode ser antes do check-in.");
        }

        this.checkin = newCheckin;
        this.checkout = newCheckout;
        System.out.println("Datas atualizadas com sucesso!");
        return true;
    }

    public static void registerReservation(Scanner scanner) {
        int roomNumber = intVerification(scanner);
        LocalDate checkin = dateVerification(scanner, "Checkin");
        LocalDate checkout = dateVerification(scanner, "Checkout");

        while (checkout.isBefore(checkin)) {
            System.out.println("Erro: Data de checkout não pode ser antes do check-in.");
            checkout = dateVerification(scanner, "Checkout");
        }

        Reservation reservation = new Reservation(roomNumber, checkin, checkout);
        System.out.print("Reserva criada com sucesso!\n" + reservation);

        System.out.print("\nUpdate reservation (YES/NO)? ");
        String response1 = scanner.next().toUpperCase();
        scanner.nextLine();

        if (response1.equals("YES")) {
            boolean updated = false;
            while (!updated) {
                LocalDate checkin2 = dateVerification(scanner, "Checkin");
                LocalDate checkout2 = dateVerification(scanner, "Checkout");

                try {
                    updated = reservation.updateDates(checkin2, checkout2);
                } catch (DomainException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
            System.out.println(reservation);
        }

    }

    public static int intVerification(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Room Number: ");
                int roomNumber = scanner.nextInt();
                scanner.nextLine();

                if (roomNumber <= 0) {
                    throw new IllegalArgumentException("O número do quarto deve ser maior que zero.");
                }

                if (roomNumber > 100) {
                    throw new IllegalArgumentException("O hotel só possui 100 quartos.");
                }

                return roomNumber;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido!");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
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

}
