package org.ies.departmentStore.components.reader.random;

import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.model.*;

import java.util.Random;

public class DepartmentStoreRandomReader implements Reader<DepartmentStore> {
    private final static String[] STORES = {"CC Los Ángeles", "Almacenes Villaverde", "CC Rio Plaza"};
    private final static String[] ADDRESSES = {"Bocata", "Sandia", "Aguacate", "Bruja", "Oporto"};
    private final Random random;
    private final Reader<Department<Technology>> technologyDepartmentReader;
    private final Reader<Department<Clothes>> clothesDepartmentReader;
    private final Reader<Department<Product>> generalDepartmentReader;

    public DepartmentStoreRandomReader(Random random, Reader<Department<Technology>> technologyDepartmentReader, Reader<Department<Clothes>> clothesDepartmentReader, Reader<Department<Product>> generalDepartmentReader) {
        this.random = random;
        this.technologyDepartmentReader = technologyDepartmentReader;
        this.clothesDepartmentReader = clothesDepartmentReader;
        this.generalDepartmentReader = generalDepartmentReader;
    }

    @Override
    public DepartmentStore read() {
        return new DepartmentStore(
                STORES[random.nextInt(3)],
                "C/ " + ADDRESSES[random.nextInt(5)] + random.nextInt(1, 26),
                technologyDepartmentReader.read(),
                clothesDepartmentReader.read(),
                generalDepartmentReader.read()
        );
    }
}
