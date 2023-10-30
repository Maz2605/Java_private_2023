import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scan.nextLine();
        int S_chu = 0;
        int S_so = 0;
        int S_ky_tu = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                S_chu++;
            } else if (Character.isDigit(s.charAt(i))) {
                S_so++;
            } else
                S_ky_tu++;
        }
        System.out.println(S_chu + " " + S_so + " " + S_ky_tu);
        scan.close();
    }
}
