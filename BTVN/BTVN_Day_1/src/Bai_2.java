import java.util.Scanner;

public class Bai_2 {
    public static void Chuyen_doi(int a, int he_co_so) {
        int i = 0;
        char s;
        int kq;
        while (a > 0) {
            kq = a % he_co_so;

            a /= he_co_so;
        }
    }
    public static String Hex(int x){
        switch (x){
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int he_co_so;
    }
}