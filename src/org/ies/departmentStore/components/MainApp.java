package org.ies.departmentStore.components;

import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.model.DepartmentStore;

import java.util.Scanner;

public class MainApp {
    private final Scanner scanner;
    private final Reader<DepartmentStore> departmentStoreReader;

    public MainApp(Scanner scanner, Reader<DepartmentStore> departmentStoreReader) {
        this.scanner = scanner;
        this.departmentStoreReader = departmentStoreReader;
    }

    public void run(){
        System.out.println("¡Bienvenido!");
        var departmentStore = departmentStoreReader.read();
        var general = departmentStore.getGeneralDepartment();
        var tech = departmentStore.getTechnologyDepartment();
        var cloth = departmentStore.getClothesDepartment();

        int option;
        do {
            option = chooseOption();
            if (option == 1){
                tech.showTechStock();
                general.showTechStock();
            } else if (option == 2){
                cloth.showClothesStock();
                cloth.showClothesStock();
            } else if (option == 3){
                tech.showTechStock();
                cloth.showClothesStock();
            } else {
                System.out.println("¡Hasta luego!");
            }
        } while (option != 4);
    }

    private int chooseOption() {
        int option;
        do {
            System.out.println("Elija una opción: ");
            System.out.println("1. Mostrar todos los productos de electrónica");
            System.out.println("2. Mostrar todos los productos de ropa");
            System.out.println("3. Mostrar todo el stock disponible");
            System.out.println("4. Salir");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option < 1 || option > 4);
        return option;
    }
}
