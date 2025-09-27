package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + "sq. units, side: " + side + " units, color: " + color);
    }
}
