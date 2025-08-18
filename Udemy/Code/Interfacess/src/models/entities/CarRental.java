package Udemy.Code.Interfacess.src.models.entities;

import java.time.LocalDateTime;
import java.util.Scanner;

import Udemy.Code.Exceptions.Reservations.DomainException;
import Udemy.Code.Interfacess.src.models.services.BrazilTaxService;
import Udemy.Code.Interfacess.src.models.services.RentalService;
import Udemy.Code.Interfacess.src.models.utils.Tratatives;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public static boolean registerLocalDateTime(LocalDateTime start, LocalDateTime finish) throws DomainException {
        if (!finish.isAfter(start)) {
            throw new DomainException("A data de término deve ser maior que a data de início!");
        }
        System.out.println("Datas registradas com sucesso!");
        return true;
    }

    public static void registerCarRental(Scanner scanner) {
        System.out.println("Enter with dates of rantal:");
        String model = Tratatives.StringVerification(scanner, "Model od car");

        LocalDateTime start = null;
        LocalDateTime finish = null;

        boolean result = false;
        while (!result) {
            start = Tratatives.dateVerification(scanner, "Start");
            finish = Tratatives.dateVerification(scanner, "Finish");

            try {
                result = CarRental.registerLocalDateTime(start, finish);
            } catch (DomainException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        double pricePerHour = Tratatives.doubleVerification(scanner, "Price per hour: ");
        double pricePerDay = Tratatives.doubleVerification(scanner, "Price per day: ");
        
        CarRental carRental = new CarRental(start, finish, new Vehicle(model));
        System.out.println(carRental);

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental, scanner);

    

    }

    @Override
    public String toString() {
        return "CarRental [start=" + start + ", finish=" + finish + ", vehicle=" + vehicle + ", invoice=" + invoice
                + "]";
    }

}
