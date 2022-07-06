package org.example.model;

public class ClothingItem {
    public static final String FROCK ="frock";
    public static final String Socks ="socks";

    public static final String Shoes ="shoes";


    private String type;
    private ClothingSize size;
    private double price;
    private double quantity;

    public ClothingItem(String type, ClothingSize size, double price, double quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
