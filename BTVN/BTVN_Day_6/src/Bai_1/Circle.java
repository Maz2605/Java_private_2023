package Bai_1;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filter, double radius) {
        super(color, filter);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*getRadius()*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                '}';
    }
}
