package org.ies.departmentStore.model;

import java.util.Objects;

public class Clothes extends Product{
    private String type;
    private String size;
    private String brand;

    public Clothes(int productId, double price, int stock, String type, String size, String brand) {
        super(productId, price, stock);
        this.type = type;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public void info() {
        System.out.println(toString());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(type, clothes.type) && Objects.equals(size, clothes.size) && Objects.equals(brand, clothes.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, size, brand);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "stock=" + stock +
                ", price=" + price +
                ", productId=" + productId +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
