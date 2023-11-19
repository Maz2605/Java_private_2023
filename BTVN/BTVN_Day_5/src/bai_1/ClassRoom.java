package bai_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassRoom {
    private static ArrayList<Student>studentsList = new ArrayList<>();

    public ClassRoom() {
    }

    public void sortByGpa(){
        for (int i = 0; i < studentsList.size(); i++) {
            for (int j = i+1; j < studentsList.size(); j++) {
                if(studentsList.get(i).getGpa()>studentsList.get(j).getGpa()){
                    Collections.swap(studentsList,i,j);
                }
            }
        }
    }
    public void deleteById(int id){
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getId()==id)
                studentsList.remove(i--);
        }
    }
    public void inputList(){
        int i =1;
        while (true){
            Student x = new Student();
            System.out.println("STT: "+i++);
            x.Input();
            if(x.getId()==555)
                return;
            studentsList.add(x);
        }
    }
    public void outputList(){
        System.out.printf("%-10s%-30s%-10s%-40s%-20s%-10s%-10s\n","Id","Tên","Tuổi","Địa chỉ (Xã/Huyện/Tỉnh)","Lớp","GPA","Kết quả");
        for (Student x:studentsList) {
            x.Output();
            if (!x.checkFall())
                System.out.printf("%-10s\n","Pass");
            else
                System.out.printf("%-10s\n","Fall");
        }
    }

    public static void main(String[] args) {
        ClassRoom x = new ClassRoom();
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------Menu-------------------");
        System.out.println("|   1. Nhập thông tin sinh viên           |");
        System.out.println("|   2. Hiển thị danh sách                 |");
        System.out.println("|   3. Sắp xếp theo GPA                   |");
        System.out.println("|   4. Xóa sinh viên theo ID              |");
        System.out.println("|   5. Thoát chương trình                 |");
        System.out.println("-------------------------------------------");
        int select;
        while (true){
            System.out.print("Nhập lựa chọn(1/2/3/4/5): ");
            select = scan.nextInt();
            switch (select){
                case 1:
                    x.inputList();
                    break;
                case 2:
                    x.outputList();
                    break;
                case 3:
                    x.sortByGpa();
                    x.outputList();
                    break;
                case 4:
                    System.out.print("Id muốn xóa: ");
                    int idDelete = scan.nextInt();
                    x.deleteById(idDelete);
                    x.outputList();
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Yêu cầu không hợp lệ\nVui lòng nhập lại");
                    break;
            }
        }
    }
}
