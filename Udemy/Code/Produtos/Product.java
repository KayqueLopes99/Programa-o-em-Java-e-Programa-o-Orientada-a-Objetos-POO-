package Udemy.Code.Produtos;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this(name, price, 0);
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
        System.out.println("Added " + quantity + " products to stock.");
    }

    public void removeProducts(int quantity) {
        if (this.quantity <= 0) {
            System.out.println("No products to remove.");
        } else if (quantity > this.quantity) {
            System.out.println("Not enough products in stock to remove.");
        } else {
            this.quantity -= quantity;
            System.out.println("Removed " + quantity + " products from stock.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Product: " + name + 
        ", Price: $" + String.format("%.2f", price) + 
        ", Quantity: " + quantity + 
        ", Total value in stock: $" + String.format("%.2f", totalValueInStock());
    }
}
