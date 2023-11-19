package co_lasss;

import java.util.Scanner;

public class Sach {
    private String id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia x = new TacGia();

    public Sach() {
    }

    public Sach(String id, String tenSach, int namXuatBan, String theLoai, TacGia x) {
        this.id = id;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.x = x;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getX() {
        return x;
    }

    public void setX(TacGia x) {
        this.x = x;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Id: ");
        id = scan.nextLine();
        System.out.print("Tên sách: ");
        tenSach = scan.nextLine();
        System.out.print("Năm xuất bản: ");
        namXuatBan = scan.nextInt();
        scan.nextLine();
        System.out.print("Thể loại: ");
        theLoai = scan.nextLine();
        x.Input();
    }

    public void Output() {
        System.out.printf("%-10s%-30s%-20d%-20s", id, tenSach, namXuatBan, theLoai);
        x.OutPut();
    }

}
