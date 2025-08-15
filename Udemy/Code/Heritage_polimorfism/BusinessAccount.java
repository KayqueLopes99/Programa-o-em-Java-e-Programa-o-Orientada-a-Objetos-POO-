package Udemy.Code.Heritage_polimorfism;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= this.loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " BusinessAccount [loanLimit=" + loanLimit + "]";
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }


    
    
}
