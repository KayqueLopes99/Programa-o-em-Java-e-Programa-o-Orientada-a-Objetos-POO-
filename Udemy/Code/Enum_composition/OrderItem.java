package Udemy.Code.Enum_composition;


public class OrderItem extends Product {
    private int quantity;

    public OrderItem(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double subTotal(){
        return super.getPrice() * this.quantity;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Quantity: " + quantity + "Subtotal: " + subTotal();
    }
    
}
