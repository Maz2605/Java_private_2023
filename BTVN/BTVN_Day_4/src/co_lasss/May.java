package co_lasss;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Mã máy: ");
        setMaMay(scan.nextInt());
        scan.nextLine();
        System.out.print("Kiểu máy: ");
        setKieuMay(scan.nextLine());
        System.out.print("Tình trạng máy: ");
        setTinhTrang(scan.nextLine());
    }
    public void TieuDe(){
        System.out.printf("%-5s%-20s%-30s%-30s\n","STT","Mã máy","Kiểu máy","Tình trạng");
    }
    public void Output(){
        System.out.printf("%-20s%-30s%-30s\n",getMaMay(),getKieuMay(),getTinhTrang());
    }

}
