package org.ies.departmentStore.model;

import java.util.Objects;

public abstract class Product {
    protected int productId;
    protected double price;
    protected int stock;

    public Product(int productId, double price, int stock) {
        this.productId = productId;
        this.price = price;
        this.stock = stock;
    }

    public abstract void info();

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(price, product.price) == 0 && stock == product.stock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, price, stock);
    }
}
