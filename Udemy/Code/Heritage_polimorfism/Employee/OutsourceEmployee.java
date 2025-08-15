package Udemy.Code.Heritage_polimorfism.Employee;

public class OutsourceEmployee extends Employee {
    private double additionalCharge;

    public OutsourceEmployee(String name, int hours, double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + this.additionalCharge * 1.1;
    }
    
}
