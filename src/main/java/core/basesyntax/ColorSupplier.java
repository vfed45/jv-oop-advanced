package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    private String[] colors = {"red", "blue", "green",
            "yellow", "orange", "pink", "purple", "cyan", "grey", "black"};

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}

