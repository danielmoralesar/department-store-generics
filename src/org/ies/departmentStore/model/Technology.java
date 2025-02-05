package org.ies.departmentStore.model;

import java.util.Objects;

public class Technology extends Product{
    private String type;
    private String model;
    private String manufacturer;

    public Technology(int productId, double price, int stock, String type, String model, String manufacturer) {
        super(productId, price, stock);
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Technology that = (Technology) o;
        return Objects.equals(type, that.type) && Objects.equals(model, that.model) && Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, model, manufacturer);
    }

    @Override
    public String toString() {
        return "Technology{" +
                "stock=" + stock +
                ", price=" + price +
                ", productId=" + productId +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
