package Udemy.Code.Interfacess.Contracts.src.models.services;

public interface OnlinePaymentService {

    public double paymentFee(double amount);

    public double interest(double amount, int numberOfInstallment);

}
