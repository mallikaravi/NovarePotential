package org.example.model;

public class Shoes extends ClothingItem{

    public Shoes( ClothingSize size, double price, double quantity) {
        super(ClothingItem.Shoes, size, price, quantity);
    }
}
