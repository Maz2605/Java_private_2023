import java.util.Scanner;

public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(){

    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Complete");
    }
    public void withdraw(int amount){
        if(balance<amount)
            System.out.println("Error");
        else
            balance-=amount;
    }
    public void Display(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = scan.nextLine();
        System.out.print("Nhap ten: ");
        name = scan.nextLine();
        System.out.print("Nhap so du: ");
        balance = scan.nextInt();
        while (true){
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            int check = scan.nextInt();
            switch (check){
                case 1:
                    System.out.print("Nhap so tien muon gui: ");
                    deposit(scan.nextInt());
                    System.out.print("So du tk hien tai: "+getBalance());
                    break;
                case 2:
                    System.out.print("Nhap so tien muon rut: ");
                    withdraw(scan.nextInt());
                    System.out.print("So du tk hien tai: "+getBalance());
                    break;
                default:
                    break;
            }
            break;
        }
    }
}
