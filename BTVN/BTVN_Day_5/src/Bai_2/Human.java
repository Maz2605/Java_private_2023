package Bai_2;

import java.util.Scanner;

public class Human {
    private String name;
    private String taxCode;
    private String bankAccountNumber;
    private String phoneNumber;
    private Address address = new Address();

    public Human() {
    }

    public Human(String name, String taxCode, String bankAccountNumber, String phoneNumber, Address address) {
        this.name = name;
        this.taxCode = taxCode;
        this.bankAccountNumber = bankAccountNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Input() {
        Scanner scan = new Scanner(System.in);
        setName(scan.nextLine());
        System.out.println("Địa chỉ: ");
        address.Input();
        System.out.print("Mã số thuế: ");
        setTaxCode(scan.nextLine());
        System.out.print("Số tài khoản: ");
        setBankAccountNumber(scan.nextLine());
        System.out.print("Số điện thoại: ");
        setPhoneNumber(scan.nextLine());
    }

    public void Output() {
        System.out.println(getName());
        System.out.print("\tĐịa chỉ: ");
        address.Output();
        System.out.println("\tMã số thuế: " + getTaxCode());
        System.out.println("\tSố tài khoản: " + getBankAccountNumber());
        System.out.println("\tSố điện thoại: " + getBankAccountNumber());
    }
}
