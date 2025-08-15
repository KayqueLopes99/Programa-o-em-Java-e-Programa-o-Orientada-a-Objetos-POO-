package Udemy.Code.Enum_composition.Departament;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private double valueperHour;
    private int hours;

    public HourContract(LocalDate date, double valueperHour, int hours) {
        this.date = date;
        this.valueperHour = valueperHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getvalueperHour() {
        return valueperHour;
    }

    public void setvalueperHour(double valueperHour) {
        this.valueperHour = valueperHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return this.valueperHour * this.hours;
    }

    @Override
    public String toString() {
        return "HourContract [date=" + date + ", valueperHour=" + valueperHour + ", hours=" + hours + "]";
    }
}
