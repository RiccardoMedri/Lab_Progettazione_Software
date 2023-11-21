package it.unibo.collections.design.impl;

import java.util.HashSet;
import java.util.Set;
import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WarehouseImpl implements Warehouse {
    
    private Set<Product> products;

    public WarehouseImpl() {
        this.products = new HashSet<>();
    }

    @Override
    public void addProduct(Product p) {
        if(!containsProduct(p)) {
            products.add(p);
        }
    }

    @Override
    public Set<String> allNames() {
        Set<String> names = new HashSet<>();
        for (Product product : products) {
            names.add(product.getName());
        }
        return names;
    }

    public Set<Products> allProducts() {
        return new HashSet<>(products);
    }

    public boolean containsProduct(Product p) {
        return products.contains(p);
    }

    public double getQuantity(String name) {
        for (Product product : products) {
            if(product.getName().equals(name)) {
                return product.getQuantity();
            }
        }
    }
}
