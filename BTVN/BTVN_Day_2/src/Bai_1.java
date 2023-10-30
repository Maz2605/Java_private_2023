import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] a = new int[n];
        System.out.print("Nhap mang: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j] == arr[i])
                    a[i]+=1;
            }
        }
        int max=a[0];
        int index = 0;
        for(int i=0;i<n;i++){
            if(a[i]>max) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("So xuat hien nhieu nhat: "+arr[index]);
        System.out.println("So lan xuat hien: "+a[index]);

    }
}
