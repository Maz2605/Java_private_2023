import java.util.Scanner;

class Bai_4{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int kq = 0;
        System.out.print("Nhap bieu thuc: ");
        a = scan.nextInt();
        char x = scan.next().charAt(0);
        b = scan.nextInt();
        switch (x) {
            case '+':
                kq = a + b;
                break;
            case '-':
                kq = a - b;
                break;
            case '*':
            case 'x':
            case '.':
                kq = a * b;
                break;
            case '/':
            case ':':
                kq = a / b;
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.print(a +" "+ x+ " "+ b + " = "+ kq);
        scan.close();

    }
}