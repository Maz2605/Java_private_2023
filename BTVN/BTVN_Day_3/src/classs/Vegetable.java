package classs;

public class Vegetable {
    private String id;
    private String name;
    private String unit;
    private int quantitySolt;
    private int sale;
    private double price;

    public Vegetable() {
    }

    public Vegetable(String id, String name, String unit, int quantitySolt, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySolt = quantitySolt;
        this.sale = sale;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getQuantitySolt() {
        return quantitySolt;
    }

    public void setQuantitySolt(int quantitySolt) {
        this.quantitySolt = quantitySolt;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalRevenue() {
        return quantitySolt * (price - (price * sale / 100));
    }

    public void tieu_de() {
        System.out.printf("%-10s %-30s %-15s %-30s %-20s %-20s %-20s\n", "Id", "Tên rau", "Đơn vị đo", "Số lượng đã bán", "Khuyến mại", "Giá bán", "Doanh thu");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void display() {
        System.out.printf("%-10s %-30s %-15s %-30d %-20d %-20f %-20f\n", getId(), getName(), getUnit(), getQuantitySolt(), getSale(), getPrice(), getTotalRevenue());
    }
}
