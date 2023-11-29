package Bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.println("----------------Menu-----------------");
        System.out.println("|   1. Nhập hình                    |");
        System.out.println("|   2. Xuất hình                    |");
        System.out.println("|   3. Thoát                        |");
        System.out.println("-------------------------------------");
        while (true){
            System.out.print("Nhập lựa chọn của bạn: ");
            int n = scan.nextInt();
            switch (n){
                case 1:
                    System.out.println("\t1. Hình vuông");
                    System.out.println("\t2. Hình tròn");
                    System.out.println("\t1. Hình chữ nhật");
                    System.out.println("Nhâp lựa chọn hình");
                    int select = scan.nextInt();
                    switch (select){
                        case 1:
                            Square square = new Square();
                            System.out.print("Nhập cạnh: ");
                            square.setSide(scan.nextDouble());
                            list.add(square);
                            break;
                        case 2:
                            Circle circle = new Circle();
                            System.out.print("Nhập bán kính: ");
                            circle.setRadius(scan.nextDouble());
                            list.add(circle);
                            break;
                        case 3:
                            Retangle retangle =new Retangle();
                            System.out.print("Nhập chiều dài: ");
                            retangle.setLength(scan.nextDouble());
                            System.out.print("Nhập chiều rộng: ");
                            retangle.setWidth(scan.nextDouble());
                            list.add(retangle);
                            break;
                        default:
                            System.out.println("Hình không hợp lệ");
                            break;
                    }
                case 2:
                    for(Shape x: list ){
                        x.toString();
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Yêu cầu không hợp lệ\nVui lòng nhập lại ");
                    break;
            }


        }
    }
}
