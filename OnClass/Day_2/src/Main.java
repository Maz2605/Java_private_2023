import java.util.Scanner;

public class Main {
    public static final int he = 3;
    public static void main(String[] args) {
        int[] arp = new int[5];
        int[] arr = new int[2];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<arp.length;i++){
            arp[i] = scan.nextInt();
        }
        for (int  i : arp) {
            System.out.print(i + " ");
        }

    }

}