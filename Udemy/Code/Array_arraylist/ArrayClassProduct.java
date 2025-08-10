package Udemy.Code.Array_arraylist;

public class ArrayClassProduct {
    private String name;
    private double price;

    public ArrayClassProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: " + price;
    }
}
