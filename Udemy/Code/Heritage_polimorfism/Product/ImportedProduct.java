package Udemy.Code.Heritage_polimorfism.Product;

public class ImportedProduct extends Product {
    private double customsFee;

    
    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return super.getPrice() + this.customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "(Customs fee: R$ " + this.customsFee + ")";
    }
    
}
