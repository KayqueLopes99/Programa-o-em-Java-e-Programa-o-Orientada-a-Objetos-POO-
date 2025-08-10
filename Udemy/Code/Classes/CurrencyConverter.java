package Udemy.Code.Classes;

public class CurrencyConverter {
public static double IOF = 0.06;

    public static double convertToReal(double dollarPrice, double amount) {
        return amount * dollarPrice * (1.0 + IOF);
    }

}
