package bai_tap;

import classs.Subject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai_2 {
    public static List<Subject> list = new ArrayList<>();
    public static void Input(Scanner scan, Subject x){
        scan.nextLine();
        System.out.print("Id: ");
        x.setId(scan.nextLine());
        for (Subject check:list) {
            if(x.getId().equals(check.getId())) {
                System.out.println("ID bị trùng ");
                return;
            }
        }
        System.out.print("Tên môn học: ");
        x.setSubjectName(scan.nextLine());
        System.out.print("Số lượng sinh viên: ");
        x.setSubjectCount(scan.nextInt());
//        while(true) {
        System.out.print("Thời gian bắt đầu (Giờ:Phút): ");
        scan.nextLine();
        x.setTimeStart(scan.nextLine());
//           String[] timeStartNumber = x.getTimeEnd().split(":");
//           int hourStart = Integer.parseInt(timeStartNumber[0]);
//           int minuteStart = Integer.parseInt(timeStartNumber[1]);
//           if (hourStart > 0 && hourStart < 24 && minuteStart >= 0 && minuteStart < 60)
//               break;
//           System.out.println("Dữ liệu không hợp lệ\nVui lòng nhập lại");
//        }
//        while (true){
           System.out.print("Thời gian kết thúc (Giờ:Phút): ");
            x.setTimeEnd(scan.nextLine());
//            String[] timeEndNumber = x.getTimeEnd().split(":");
//            int hourEnd = Integer.parseInt(timeEndNumber[0]);
//            int minuteEnd  =Integer.parseInt(timeEndNumber[1]);
//            if(hourEnd>0&&hourEnd<24&&minuteEnd>=0&&minuteEnd<60)
//                break;
//       }
        list.add(x);
    }
    public static int time(Subject x){
        String[] timeEndNumber = x.getTimeEnd().split(":");
        int hourEnd = Integer.parseInt(timeEndNumber[0]);
        int minuteEnd  =Integer.parseInt(timeEndNumber[1]);
        return hourEnd*60+minuteEnd;
    }
    public static void Sort(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(time(list.get(i))>time(list.get(j)))
                    Collections.swap(list,i,j);
            }
        }
        list.get(0).Tieu_de();
        for (Subject out : list) {
            out.Output();
        }
    }
    public static void LuaChonMonHoc(Scanner scan){
        System.out.println("Nhập khoảng thời gian bắt đầu: ");
        scan.nextLine();
        String timeStart = scan.nextLine();
        System.out.println("Nhập khoảng thời gia kết thúc: ");
        String timeEnd = scan.nextLine();
        //thay time end của đối tượng thành time start
        int timeStartInt = time(new Subject(" ","",0,"",timeStart));
        int timeEndInt = time(new Subject(" ","",0,"",timeEnd));
        List<Subject> MonHocHopLe = new ArrayList<>();
        for (Subject x:list) {
            int subjectTimeStart = time(new Subject("","",0,"",x.getTimeStart()));
            int subjectTimeEnd = time(x);
            if(subjectTimeStart>=timeStartInt&&subjectTimeEnd<=timeEndInt){
                MonHocHopLe.add(x);
            }
        }
        if(MonHocHopLe.isEmpty()) {
            System.out.println("Không có môn học nào hợp lệ");
            return;
        }
        MonHocHopLe.get(0).Tieu_de();
        for (Subject x:MonHocHopLe) {
            x.Output();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------MENU-----------------");
        System.out.println("|   1. Nhập môn học mới                 |");
        System.out.println("|   2. Hiển thị danh sách               |");
        System.out.println("|   3. Sắp xếp môn học                  |");
        System.out.println("|   4. Lựa chọn môn học                 |");
        System.out.println("|   5. Thoát chương trình               |");
        System.out.println("-----------------------------------------");
        while (true){
            System.out.print("Nhập lựa chọn: ");
            int lua_chon = scan.nextInt();
            switch (lua_chon) {
                case 1:
                    Subject subject = new Subject();
                    Input(scan, subject);
                    break;
                case 2:
                    list.get(0).Tieu_de();
                    for (Subject out : list) {
                        out.Output();
                    }
                    break;
                case 3:
                    Sort();
                    break;
                case 4:
                    LuaChonMonHoc(scan);
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Yêu cầu không hợp lệ\nVui lòng nhập lại");
                    break;
            }
            if (lua_chon==5)
                break;
        }
    }
}
