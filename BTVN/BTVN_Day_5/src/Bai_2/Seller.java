package Bai_2;

public class Seller extends Human {
    public Seller() {
    }

    public Seller(String name, String taxCode, String bankAccountNumber, String phoneNumber, Address address) {
        super(name, taxCode, bankAccountNumber, phoneNumber, address);
    }

    @Override
    public void Input() {
        System.out.print("Tên người bán: ");
        super.Input();
    }

    @Override
    public void Output() {
        System.out.print("Tên người bán: ");
        super.Output();
    }
}
