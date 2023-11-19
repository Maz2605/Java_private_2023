package co_lasss;

import java.util.*;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private QuanLy quanLy;
    private May[] listMay = new May[100];
    private int n;


    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, QuanLy quanLy, May[] listMay) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.quanLy = quanLy;
        this.listMay = listMay;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public May[] getListMay() {
        return listMay;
    }

    public void setListMay(May[] listMay) {
        this.listMay = listMay;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mã phòng: ");
        setMaPhong(scan.nextLine());
        System.out.print("Tên phòng: ");
        setTenPhong(scan.nextLine());
        quanLy = new QuanLy();
        quanLy.Input();
        System.out.print("Nhập số lượng máy muốn thêm(0->100): ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("STT: "+(i+1));
            listMay[i] = new May();
            listMay[i].Input();
        }
    }

    public void Output() {
        System.out.println("Mã phòng: " + getMaPhong());
        System.out.println("Tên phòng: " + getTenPhong());
        quanLy.Output();
        if (n == 0)
            System.out.println("Không có thông tin về máy");
        else {
            System.out.println("----------------------Danh sách máy-----------------------");
            listMay[0].TieuDe();
            for (int i = 0; i < n; i++) {
                System.out.printf("%-5d", (i + 1));
                listMay[i].Output();
            }
        }
    }

    public void Search(int maMay) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (listMay[i].getMaMay() == maMay) {
                if (!check)
                    listMay[i].TieuDe();
                check = true;
                System.out.printf("%-5d", (i + 1));
                listMay[i].Output();
            }
        }
        if (!check)
            System.out.println("Không có máy cần tìm");
    }

    public void Search(String kieuMay) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (listMay[i].getKieuMay().equals(kieuMay)) {
                if (!check)
                    listMay[i].TieuDe();
                check = true;
                System.out.printf("%-5d", (i + 1));
                listMay[i].Output();
            }
        }
        if (!check)
            System.out.println("Không có máy cần tìm");
    }


}
