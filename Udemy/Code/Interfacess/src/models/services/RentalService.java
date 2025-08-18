package Udemy.Code.Interfacess.src.models.services;

import java.time.Duration;
import java.util.Scanner;

import Udemy.Code.Interfacess.src.models.entities.CarRental;
import Udemy.Code.Interfacess.src.models.entities.Invoice;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;

    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental, Scanner scanner) {
        double durationInMinutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();

        double hours = durationInMinutes / 60.0;

        double basicPayment;

        if (hours <= 12.0) {
            basicPayment = this.pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = this.pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);


        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    @Override
    public String toString() {
        return "RentalService [pricePerHour=" + pricePerHour + ", pricePerDay=" + pricePerDay + "]";
    }

}
