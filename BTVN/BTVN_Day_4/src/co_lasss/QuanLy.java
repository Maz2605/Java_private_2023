package co_lasss;

import java.util.Scanner;

public class QuanLy {
    private String maQuanLy;
    private String tenQuanLy;

    public QuanLy() {
    }

    public QuanLy(String maQuanLy, String tenQuanLy) {
        this.maQuanLy = maQuanLy;
        this.tenQuanLy = tenQuanLy;
    }

    public String getMaQuanLy() {
        return maQuanLy;
    }

    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy = maQuanLy;
    }

    public String getTenQuanLy() {
        return tenQuanLy;
    }

    public void setTenQuanLy(String tenQuanLy) {
        this.tenQuanLy = tenQuanLy;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mã quản lý: ");
        setMaQuanLy(scan.nextLine());
        System.out.print("Tên quản lý: ");
        setTenQuanLy(scan.nextLine());
    }

    public void Output() {
        System.out.println("Mã quản lý: " + getMaQuanLy());
        System.out.println("Tên quản lý: " + getTenQuanLy());
    }

}
