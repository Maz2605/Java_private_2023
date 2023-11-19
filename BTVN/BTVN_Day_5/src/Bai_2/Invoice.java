package Bai_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Invoice {
    private String sign;
    private String id;
    private Date date = new Date();
    private String paymentForm;
    private String currentcyUnit;
    private Customer customer = new Customer();
    private Seller seller = new Seller();
    private ArrayList<Items> listItems = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String sign, String id, Date date, String paymentForm, String currentcyUnit, Customer customer, Seller seller, ArrayList<Items> listItems) {
        this.sign = sign;
        this.id = id;
        this.date = date;
        this.paymentForm = paymentForm;
        this.currentcyUnit = currentcyUnit;
        this.customer = customer;
        this.seller = seller;
        this.listItems = listItems;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }

    public String getCurrentcyUnit() {
        return currentcyUnit;
    }

    public void setCurrentcyUnit(String currentcyUnit) {
        this.currentcyUnit = currentcyUnit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public ArrayList<Items> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<Items> listItems) {
        this.listItems = listItems;
    }

    public double getTotal() {
        double total = 0;
        for (Items items : listItems) {
            total += items.getTotal();
        }
        return total;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ký hiệu: ");
        setSign(scan.nextLine());
        System.out.print("Số: ");
        setId(scan.nextLine());
        System.out.println("Ngày/Tháng/Năm:");
        while (true) {
            date.Input();
            boolean check = date.Check(date.getDay(), date.getMonth(), date.getYear());
            if(check)
                break;
            System.out.println("Dữ liệu không hợp lệ\nVui lòng nhập lại");
        }
        seller.Input();
        customer.Input();
        System.out.print("Hình thức thanh toán: ");
        setPaymentForm(scan.nextLine());
        System.out.print("Đơn vị tiền tệ: ");
        setCurrentcyUnit(scan.nextLine());
        System.out.print("Số lượng hàng hóa cần nhập: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            Items x = new Items();
            System.out.println("STT: " + (i + 1));
            x.Input();
            listItems.add(x);
        }
    }

    public void header() {
        System.out.printf("%-5s%-30s%-20s%-25s%-25s%-30s\n", "STT", "Tên mặt hàng", "Đơn vi tính", "Số lượng", "Đơn giá", "Thành tiền");
    }
    public void getItemMax(){
        int maxQuantity = listItems.get(0).getQuantity();
        for (Items x:listItems) {
            if(x.getQuantity()>maxQuantity) {
                maxQuantity = x.getQuantity();
            }
        }
        header();
        for (int i = 0; i < listItems.size(); i++) {
            if(listItems.get(i).getQuantity()==maxQuantity){
                System.out.printf("%-5d",(i+1));
                listItems.get(i).Output();
            }
        }

    }
    public void Output() {
        System.out.println("--------------Hóa đơn bán hàng-------------------");
        System.out.println("Ký hiệu: " + getSign());
        System.out.println("Số: " + getId());
        date.Output();
        seller.Output();
        customer.Output();
        System.out.print("Hình thức thanh toán: " + getPaymentForm());
        System.out.println("\t\tĐơn vị tiền tệ: " + getCurrentcyUnit());
        for (int i = 0; i < listItems.size(); i++) {
            for (int j = i + 1; j < listItems.size(); j++) {
                if (listItems.get(i).getPrice() < listItems.get(j).getPrice()) {
                    Collections.swap(listItems, i, j);
                }
            }
        }
        int i = 1;
        header();
        for (Items x : listItems) {
            System.out.printf("%-5d", i++);
            x.Output();
        }
        System.out.println("Tổng tiền phải trả: " + getTotal());
    }
}
