package Bai_1;

public abstract class Shape {
    protected String color;
    protected boolean filter;

    public Shape() {
    }

    public Shape(String color, boolean filter) {
        this.color = color;
        this.filter = filter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filter=" + filter +
                '}';
    }
}
