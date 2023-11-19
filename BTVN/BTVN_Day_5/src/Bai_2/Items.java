package Bai_2;

import java.util.Scanner;

public class Items {
    private String name;
    private String unit;
    private int quantity;
    private float price;

    public Items() {
    }

    public Items(String name, String unit, int quantity, float price) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getTotal() {
        return (double)getPrice() * getQuantity();
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tên mặt hàng: ");
        setName(scan.nextLine());
        System.out.print("Đơn vị tính: ");
        setUnit(scan.nextLine());
        System.out.print("Số lượng: ");
        setQuantity(scan.nextInt());
        System.out.print("Đơn giá: ");
        setPrice(scan.nextFloat());
    }

    public void Output() {
        System.out.printf("%-30s%-20s%-25s%-25s%-30.2f\n", getName(), getUnit(), getQuantity(), getPrice(), getTotal());
    }

}
