package btvn;


import co_lasss.PhongMay;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PhongMay x = new PhongMay();
        System.out.println("----------------Menu----------------");
        System.out.println("|1. Nhập vào thông tin 1 phòng máy |");
        System.out.println("|2. Xuất thông tin phòng máy       |");
        System.out.println("|3. Tìm kiếm theo kiểu máy         |");
        System.out.println("|4. Tìm kiếm theo mã máy           |");
        System.out.println("------------------------------------");
        int select;
        while (true) {
            System.out.print("Nhập lựa chọn: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    x.Input();
                    break;
                case 2:
                    x.Output();
                    break;
                case 3:
                    System.out.print("Nhập kiểu máy cần tìm: ");
                    scan.nextLine();
                    String kieuMayCan = scan.nextLine();
                    x.Search(kieuMayCan);
                    break;
                case 4:
                    System.out.print("Nhập mã máy muốn tìm: ");
                    int maMayCan = scan.nextInt();
                    x.Search(maMayCan);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu không hợp lệ\nVui lòng nhập lại");
                    break;
            }

        }

    }
}
