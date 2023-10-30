import java.util.Scanner;
public class BT_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap mang: ");
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int[] ar = new int [n];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ar[i] = ar[i]+1;
                }
            }
        }
        int maxx = ar[0];
        int index = 0;
        for(int i = 0;i<n;i++){
            if(ar[i]>maxx){
                maxx = ar[i];
                index = i;
            }
        }
        System.out.println("So lap lai nhieu nhat la: "+arr[index]);
        System.out.println("So lan lap lai: "+ ar[index]);
    }
}
