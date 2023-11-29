package Bai_1;

public class Retangle extends Shape{
    protected double width;
    protected double length;

    public Retangle() {
    }

    public Retangle(String color, boolean filter, double width, double length) {
        super(color, filter);
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, boolean filter) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return (getLength()+getWidth())*2;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", height=" + length +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                '}';
    }
}
