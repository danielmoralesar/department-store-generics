package org.ies.departmentStore.components.reader.random;

import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.model.Clothes;
import org.ies.departmentStore.model.Product;
import org.ies.departmentStore.model.Technology;

import java.util.Random;

public class ProductRandomReader implements Reader<Product> {
    private final Random random;
    private final Reader<Clothes> clothesReader;
    private final Reader<Technology> technologyReader;

    public ProductRandomReader(Random random, Reader<Clothes> clothesReader, Reader<Technology> technologyReader) {
        this.random = random;
        this.clothesReader = clothesReader;
        this.technologyReader = technologyReader;
    }

    @Override
    public Product read() {
        int product = random.nextInt(2);

        if (product == 0){
            return clothesReader.read();
        } else {
            return technologyReader.read();
        }
    }
}
