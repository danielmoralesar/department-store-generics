package org.ies.departmentStore;

import org.ies.departmentStore.components.MainApp;
import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.components.reader.random.*;
import org.ies.departmentStore.model.Clothes;
import org.ies.departmentStore.model.Product;
import org.ies.departmentStore.model.Technology;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var random = new Random();
        var scanner = new Scanner(System.in);
        var technologyReader = new TechnologyRandomReader(random);
        var clothesReader = new ClothesRandomReader(random);
        var productReader = new ProductRandomReader(random, clothesReader, technologyReader);
        var technologyDepartmentRandomReader = new DepartmentRandomReader<>(random, technologyReader, Technology.class);
        var clothesDepartmentRandomReader = new DepartmentRandomReader<>(random, clothesReader, Clothes.class);
        var generalDepartmentRandomReader = new DepartmentRandomReader<>(random, productReader, Product.class);
        var departmentStoreRandomReader = new DepartmentStoreRandomReader(random, technologyDepartmentRandomReader, clothesDepartmentRandomReader, generalDepartmentRandomReader);
        var mainApp = new MainApp(scanner, departmentStoreRandomReader);

        mainApp.run();
    }
}