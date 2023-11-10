package bai_tap;

import classs.Vegetable;

import java.util.*;

public class Bai_1 {
    public static List<Vegetable> list= new ArrayList<>();
    public static void Input(Scanner scan){
        Vegetable x = new Vegetable();
        scan.nextLine();
        System.out.print("Id: ");
        x.setId(scan.nextLine());
        for (Vegetable checkid:list) {
            if(x.getId().equals(checkid.getId())){
                System.out.println("Id bị trùng: ");
                return;
            }
        }
        System.out.print("Tên: ");
        x.setName(scan.nextLine());
        System.out.print("Đơn vị đo: ");
        x.setUnit(scan.nextLine());
        System.out.print("Số lượng đã bán: ");
        x.setQuantitySolt(scan.nextInt());
        System.out.print("Khuyến mãi: ");
        x.setSale(scan.nextInt());
        System.out.print("Giá bán: ");
        x.setPrice(scan.nextInt());
        list.add(x);
    }
    public static void Sort(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).getTotalRevenue()>list.get(j).getTotalRevenue()){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
    public static void Group(){
        Set<Vegetable> set = new HashSet<>(list);
        for (Vegetable x:set) {
            List<Vegetable> unit = new ArrayList<>();
            for (Vegetable y:list) {
                if (y.getUnit().equals(x.getUnit())){
                    unit.add(y);
                }
            }
            System.out.println(x.getUnit());
            for (int i = 0; i < unit.size(); i++) {
                for (int j = i+1; j < unit.size(); j++) {
                    if(unit.get(i).getPrice()>unit.get(j).getPrice()){
                        Collections.swap(unit,i,j);
                    }
                }
            }
            x.tieu_de();
            for (Vegetable z: unit) {
                z.display();
            }
        }
    }
    public static void Search(Scanner scan){
        String nameSearch;
        scan.nextLine();
        System.out.print("Nhập tên rau muốn tìm: ");
        nameSearch = scan.nextLine();
        for (Vegetable x :list ) {
            if(x.getName().equals(nameSearch))
                x.display();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------MENU-----------------");
        System.out.println("|   1. Nhập thông tin                   |");
        System.out.println("|   2. Hiển thị danh sách               |");
        System.out.println("|   3. Sắp xếp theo doanh thu           |");
        System.out.println("|   4. Nhóm các loại rau củ             |");
        System.out.println("|   5. Tìm kiếm rau củ                  |");
        System.out.println("|   6. Thoát chương trình               |");
        System.out.println("-----------------------------------------");
        while (true){
            System.out.print("Nhập lựa chọn: ");
            int lua_chon = scan.nextInt();
            switch (lua_chon){
                case 1:
                    Input(scan);
                    break;
                case 2:
                    list.get(0).tieu_de();
                    for (Vegetable out: list) {
                        out.display();
                    }
                    break;
                case 3:
                    Sort();
                    list.get(0).tieu_de();
                    for (Vegetable out: list) {
                        out.display();
                    }
                    break;
                case 4:
                    Group();
                    break;
                case 5: 
                    Search(scan);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Yêu cầu không hợp lệ\nVui lòng nhập lại");
                    break;
            }
            if (lua_chon==6)
                break;
        }
    }
}