package Udemy.Code.Heritage_polimorfism.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate date;

    public UsedProduct(String name, double price, LocalDate date) {
        super(name, price);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String formattedDate = this.date.format(formatter);

        return super.priceTag() + " (Manufacture date: " + LocalDate.parse(formattedDate, formatter) + ")";
    }


    
    
}
