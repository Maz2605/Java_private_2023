import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap 5 so: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int max_1;
        int max_2;
        if (a >= b && a >= c && a >= d && a >= e) {
            max_1 = a;
            if (b >= c && b >= d && b >= e) {
                max_2 = b;
            } else if (c >= d && c >= e) {
                max_2 = c;
            } else if (d >= e) {
                max_2 = d;
            } else {
                max_2 = e;
            }
        } else if (b >= c && b >= d && b >= e) {
            max_1 = b;
            if (a >= c && a >= d && a >= e)
                max_2 = a;
            else if (c >= d && c >= e) {
                max_2 = c;
            } else if (d >= e) {
                max_2 = d;
            } else {
                max_2 = e;
            }
        } else if (c >= d && c >= e) {
            max_1 = c;
            if (a >= b && a >= d && a >= e) {
                max_2 = a;
            } else if (b >= d && b >= e) {
                max_2 = b;
            } else if (d >= e) {
                max_2 = d;
            } else {
                max_2 = e;
            }
        } else if (d >= e) {
            max_1 = d;
            if (a >= b && a >= c && a >= e) {
                max_2 = a;
            } else if (b >= c && b > e) {
                max_2 = b;
            } else if (c >= e) {
                max_2 = c;
            } else {
                max_2 = e;
            }
        } else {
            max_1 = e;
            if (a >= b && a >= c && a >= d) {
                max_2 = a;
            } else if (b >= c && b >= d) {
                max_2 = b;
            } else if (c >= d) {
                max_2 = c;
            } else {
                max_2 = d;
            }
        }
        System.out.println("So lon nhat va nhi lan luot la: "+max_1 + " " + max_2);
        scan.close();
    }
}
