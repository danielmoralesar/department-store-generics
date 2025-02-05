package org.ies.departmentStore.components.reader.random;

import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.model.Clothes;

import java.util.Random;

public class ClothesRandomReader implements Reader<Clothes> {
    private static final String[] CLOTHES = new String[]{"Jeans", "Skirt", "T-Shirt", "Socks", "Boots", "Jewels"};
    private static final String[] SIZES = new String[]{"XXXS", "XXS", "XS", "S", "M", "L", "XL", "XXL", "XXXL"};
    private static final String[] BRANDS = new String[]{"Boxer", "Mr S", "Pull&Bear", "Zara", "Corte Inglés"};
    private final Random random;

    public ClothesRandomReader(Random random) {
        this.random = random;
    }

    @Override
    public Clothes read() {
        return new Clothes(
                random.nextInt(100, 999),
                random.nextDouble(19.99, 999.99),
                random.nextInt(61),
                CLOTHES[random.nextInt(6)],
                SIZES[random.nextInt(9)],
                BRANDS[random.nextInt(5)]
        );
    }
}
