package Udemy.Code.Abstract.TaxPayer;

public class Company extends TaxPayer {
    private int numberOfEmployess;

    public Company(String name, double AnualIncome, int numberOfEmployess) {
        super(name, AnualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public int getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(int numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public double tax() {
        if (this.numberOfEmployess > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }

}
