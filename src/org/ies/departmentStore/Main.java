package org.ies.departmentStore;

import org.ies.departmentStore.components.MainApp;
import org.ies.departmentStore.components.reader.random.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var random = new Random();
        var scanner = new Scanner(System.in);
        var technologyReader = new TechnologyRandomReader(random);
        var clothesReader = new ClothesRandomReader(random);
        var productReader = new ProductRandomReader(random, clothesReader, technologyReader);
        var technologyDepartmentRandomReader = new DepartmentRandomReader<>(random, technologyReader);
        var clothesDepartmentRandomReader = new DepartmentRandomReader<>(random, clothesReader);
        var generalDepartmentRandomReader = new DepartmentRandomReader<>(random, productReader);
        var departmentStoreRandomReader = new DepartmentStoreRandomReader(random, technologyDepartmentRandomReader, clothesDepartmentRandomReader, generalDepartmentRandomReader);
        var mainApp = new MainApp(scanner, departmentStoreRandomReader);

        mainApp.run();
    }
}