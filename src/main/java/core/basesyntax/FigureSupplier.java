package core.basesyntax;
import java.awt.*;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, random.nextInt(MAX_SIZE));
                case 1:
                    return new Square(color, random.nextInt(MAX_SIZE));
                    case 2:
                        return new Rectangle(color, random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
                        case 3:
                            return new RightTriangle(color, random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
                            case 4:
            default:
                                return new IsoscelesTrapezoid(color, random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
