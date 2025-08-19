package Udemy.Aula_22_Interface.DefaultMethos.code;

import java.security.InvalidParameterException;

public interface InterestService {

	public double getInterestRate();

	public default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}