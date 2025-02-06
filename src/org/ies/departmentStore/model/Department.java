package org.ies.departmentStore.model;

import java.util.Arrays;
import java.util.Objects;

public class Department<T extends Product> {
    private int floor;
    private String manager;
    private T[] products;

    public Department(int floor, String manager, T[] products) {
        this.floor = floor;
        this.manager = manager;
        this.products = products;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public T[] getProducts() {
        return products;
    }

    public void setProducts(T[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department<?> that = (Department<?>) o;
        return floor == that.floor && Objects.equals(manager, that.manager) && Objects.deepEquals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, manager, Arrays.hashCode(products));
    }

    @Override
    public String toString() {
        return "Department{" +
                "floor=" + floor +
                ", manager='" + manager + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
