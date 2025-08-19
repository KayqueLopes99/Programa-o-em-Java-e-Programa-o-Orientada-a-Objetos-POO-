package Udemy.Code.Interfacess.exemple.src.models.entities;

public class Invoice {
    private double basicPayment;
    private double tax;

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public double TotalPayment() {
        return getBasicPayment() - getTax();
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Fatura:\n" +
                "Basic Payment: " + String.format("%.2f", basicPayment) + "\n" +
                "Tax: " + String.format("%.2f", tax) + "\n" +
                "Total Payment: " + String.format("%.2f", TotalPayment());
    }

}
