import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = scan.nextInt();
        int Tich = 1;
        while(a!=0){
            int x = a%10;
            Tich*= x;
            a/=10;
        }
        System.out.println("Ket qua: "+Tich);
    }
}
