package Bai_1;

public class Square extends Retangle {
    public Square() {
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filter) {
        super(color, filter);
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                '}';
    }
}
