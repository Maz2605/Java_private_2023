import java.util.Scanner;

public class Bai_1 {
    public static int UCLN(int a, int b){
        while (a!=b){
            if(a>b)
                a -=b;
            else
                b-=a;
        }
        return a;
    }
    public static int BCNN(int a, int b){
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap 3 so: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Uoc chung lon nhat: "+UCLN((UCLN(a,b)),c));
        System.out.println("Boi chung nho nhat: "+BCNN(BCNN(a,b),c));
    }
}
