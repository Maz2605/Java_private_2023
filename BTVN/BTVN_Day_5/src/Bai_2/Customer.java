package Bai_2;

public class Customer extends Human {
    public Customer() {
    }

    public Customer(String name, String taxCode, String bankAccountNumber, String phoneNumber, Address address) {
        super(name, taxCode, bankAccountNumber, phoneNumber, address);
    }

    @Override
    public void Input() {
        System.out.print("Tên khách hàng: ");
        super.Input();
    }

    @Override
    public void Output() {
        System.out.print("Tên khách hàng: ");
        super.Output();
    }
}
