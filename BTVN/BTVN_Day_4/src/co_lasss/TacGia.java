package co_lasss;

import java.util.Scanner;

public class TacGia {
    private String tenTacGia;
    private int namSinh;

    public TacGia() {
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên tác giả: ");
        tenTacGia = scan.nextLine();
        System.out.print("Năm sinh tác giả: ");
        namSinh = scan.nextInt();
    }
    public void OutPut(){
        System.out.printf("%-25s%-10d\n", tenTacGia, namSinh);
    }
}
