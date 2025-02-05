package org.ies.departmentStore.components.reader.random;

import org.ies.departmentStore.components.reader.Reader;
import org.ies.departmentStore.model.Technology;

import java.util.Random;

public class TechnologyRandomReader implements Reader<Technology> {
    private final Random random;
    private static final String[] TYPE = new String[]{"Smartphone", "Computer", "Graphic Card", "Processor", "Coffee Machine"};
    private static final String[] MODEL = new String[]{"A", "B", "C", "X", "Y", "Z", "Ultra", "Pro"};
    private static final String[] MANUFACTURER = new String[]{"Nvidia", "Apple", "MSI", "Samsung", "Asus", "Intel", "Nespresso", "Phillips"};

    public TechnologyRandomReader(Random random) {
        this.random = random;
    }

    @Override
    public Technology read() {
        return new Technology(
                random.nextInt(999, 1999),
                random.nextDouble(19.99, 9999.99),
                random.nextInt(61),
                TYPE[random.nextInt(5)],
                random.nextInt(9999) + MODEL[random.nextInt(8)],
                MANUFACTURER[random.nextInt(8)]
        );
    }
}
