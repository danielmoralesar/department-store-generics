package org.ies.departmentStore.components.reader.random;

import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.model.Department;
import org.ies.departmentStore.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DepartmentRandomReader<T extends Product> implements Reader<Department<T>> {
    private static final String[] NAMES = new String[]{"Pedro", "Samantha", "Le Coco", "Raffa", "Ines", "Santiago"};
    private final Random random;
    private final Reader<T> productReader;
    private final Class<T> clazz;

    public DepartmentRandomReader(Random random, Reader<T> productReader, Class<T> clazz) {
        this.random = random;
        this.productReader = productReader;
        this.clazz = clazz;
    }

    @Override
    public Department<T> read() {
        T[] products = (T[]) Array.newInstance(clazz, random.nextInt(1, 10));
        for (int i = 0; i < products.length; i++) {
            products[i] = productReader.read();
        }

        return new Department<>(
                random.nextInt(6),
                NAMES[random.nextInt(6)],
                products
        );
    }
}
