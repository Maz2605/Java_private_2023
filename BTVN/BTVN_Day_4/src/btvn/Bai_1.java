package btvn;

import co_lasss.Sach;


import java.util.Scanner;

public class Bai_1 {
    public static void TieuDe() {
        System.out.printf("%-5s%-10s%-30s%-20s%-20s%-25s%-10s\n", "STT", "Id", "Tên sách", "Năm xuất bản", "Thể loại", "Tác giả", "Năm sinh tác giả");
    }

    public static void searchByName(String name, Sach[] arr, int index) {
        boolean check = false;
        for (int i = 0; i < index; i++) {
            if (arr[i].getTenSach().equals(name)) {
                if (!check)
                    TieuDe();
                check = true;
                System.out.printf("%-5d", (i + 1));
                arr[i].Output();
            }
        }
        if (!check)
            System.out.println("Không có sách cần tìm");
    }

    public static void sortByName(Sach[] arr, int index) {
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (arr[i].getX().getTenTacGia().compareTo(arr[j].getX().getTenTacGia()) > 0) {
                    Sach temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        TieuDe();
        for (int i = 0; i < index; i++) {
            System.out.printf("%-5d", (i + 1));
            arr[i].Output();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int luaChon;
        int index = 0;
        Sach[] arr = new Sach[100];
        System.out.println("------------------Menu--------------------");
        System.out.println("|   1. Nhập thông tin n cuốn sách        |");
        System.out.println("|   2. Xuất danh sách                    |");
        System.out.println("|   3. Tìm kiếm sách theo tên            |");
        System.out.println("|   4. Sắp xếp danh sách theo tên tác giả|");
        System.out.println("|   5. Thoát chương trình                |");
        System.out.println("------------------------------------------");
        while (true) {
            System.out.print("Nhập lựa chọn (1/2/3/4/5): ");
            luaChon = scan.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("Số lượng sách muốn thêm: ");
                    int n = scan.nextInt();
                    if ((n + index) >= 100) {
                        System.out.println("Số lượng vượt quá giới hạn");
                        break;
                    }
                    for (int i = index; i < (n + index); i++) {
                        arr[i] = new Sach();
                        System.out.println("STT: " + (i + 1));
                        arr[i].Input();
                    }
                    index += n;
                    break;
                case 2:
                    if (index == 0) {
                        System.out.println("Không có thông tin");
                        break;
                    }
                    TieuDe();
                    for (int i = 0; i < index; i++) {
                        System.out.printf("%-5d", (i + 1));
                        arr[i].Output();
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên cần tìm: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    searchByName(name, arr, index);
                    break;
                case 4:
                    sortByName(arr, index);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Dữ liệu không hợp lệ\nVui lòng nhập lại");
                    break;
            }
        }
    }
}
