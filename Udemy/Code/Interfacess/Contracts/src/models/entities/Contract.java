package Udemy.Code.Interfacess.Contracts.src.models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Udemy.Code.Interfacess.Contracts.src.models.services.ContractService;
import Udemy.Code.Interfacess.Contracts.src.models.services.PaypalService;
import Udemy.Code.Interfacess.Contracts.src.models.utils.Tratatives;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;
    private List<Installment> listInstallments = new ArrayList<>();

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getListInstallments() {
        return listInstallments;
    }

    public void setListInstallments(List<Installment> listInstallments) {
        this.listInstallments = listInstallments;
    }

    public static void registerContract(Scanner scanner) {
        int contractNummber = Tratatives.intVerification(scanner, "Contract Number: ");
        LocalDate contractDate = Tratatives.dateVerification(scanner, "Contract");
        double contractTotalValue = Tratatives.doubleVerification(scanner, "Value of contract: ");

        int numberOfInstallments = Tratatives.intVerification(scanner, "Number Of Installments: ");

        ContractService service = new ContractService(new PaypalService());

        Contract contract = new Contract(contractNummber, contractDate, contractTotalValue);
        service.processContract(scanner, contract, numberOfInstallments);

        
    }

}
