package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;
import java.util.HashSet;
import java.util.Set;

public class ProductImpl implements Product{
    
    private String name;
    private double quantity;

    public ProductImpl(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return this.quantity;
    }
}
