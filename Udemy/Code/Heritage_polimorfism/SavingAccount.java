package Udemy.Code.Heritage_polimorfism;

public class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void uptadeBalance(){
        balance += balance * this.interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }


}
