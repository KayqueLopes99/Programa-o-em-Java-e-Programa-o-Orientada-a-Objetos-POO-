package Udemy.Code.Interfacess.Contracts.src.models.services;

import java.time.LocalDate;
import java.util.Scanner;

import Udemy.Code.Interfacess.Contracts.src.models.entities.Contract;
import Udemy.Code.Interfacess.Contracts.src.models.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Scanner scanner, Contract contract, int numberOfInstallments) {
        double basicQuota  = contract.getTotalValue() / numberOfInstallments;

        for (int i = 1; i <= numberOfInstallments; i++) {
            LocalDate dataWithMonth = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getListInstallments().add(new Installment(dataWithMonth, quota));
        }

        System.out.println("Invoices: ");
        for (Installment invoice : contract.getListInstallments()) {
            System.out.println(invoice);
        }

    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

}
