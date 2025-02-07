package org.ies.departmentStore.model;

import java.util.Objects;

public class DepartmentStore {
    private String name;
    private String address;
    private Department<Technology> technologyDepartment;
    private Department<Clothes> clothesDepartment;
    private Department<Product> generalDepartment;

    public DepartmentStore(String name, String address, Department<Technology> technologyDepartment, Department<Clothes> clothesDepartment, Department<Product> generalDepartment) {
        this.name = name;
        this.address = address;
        this.technologyDepartment = technologyDepartment;
        this.clothesDepartment = clothesDepartment;
        this.generalDepartment = generalDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department<Technology> getTechnologyDepartment() {
        return technologyDepartment;
    }

    public void setTechnologyDepartment(Department<Technology> technologyDepartment) {
        this.technologyDepartment = technologyDepartment;
    }

    public Department<Clothes> getClothesDepartment() {
        return clothesDepartment;
    }

    public void setClothesDepartment(Department<Clothes> clothesDepartment) {
        this.clothesDepartment = clothesDepartment;
    }

    public Department<Product> getGeneralDepartment() {
        return generalDepartment;
    }

    public void setGeneralDepartment(Department<Product> generalDepartment) {
        this.generalDepartment = generalDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentStore that = (DepartmentStore) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(technologyDepartment, that.technologyDepartment) && Objects.equals(clothesDepartment, that.clothesDepartment) && Objects.equals(generalDepartment, that.generalDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, technologyDepartment, clothesDepartment, generalDepartment);
    }

    @Override
    public String toString() {
        return "DepartmentStore{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", technologyDepartment=" + technologyDepartment +
                ", clothesDepartment=" + clothesDepartment +
                ", generalDepartment=" + generalDepartment +
                '}';
    }
}
