import java.util.Scanner;

public class Bai_2 {
    public static void Tinh_S(int[] arr, Scanner scan){
        int L;
        int R;
        int S = 0;
        do {
            System.out.print("Nhap goi han trai: ");
            L = scan.nextInt();
            System.out.print("Nhap goi han phai: ");
            R = scan.nextInt();
            if(L>0 && L <= arr.length && R<= arr.length && R>=L) {
                for (int i = L - 1; i < R; i++) {
                    S += arr[i];
                }
            System.out.println("Ket qua: " + S);
            }else {
                System.out.println("Gia tri nhap khong hop le\nVui long nhap lai ");
            }
        }while (L<0 || L> arr.length || R >= arr.length || R<L);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int q;
        System.out.print("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Nhap so lan muon truy xuat: ");
        q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            Tinh_S(arr, scan);
        }
        scan.close();
    }
}
