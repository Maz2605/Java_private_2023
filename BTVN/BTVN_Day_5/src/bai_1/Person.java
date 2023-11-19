package bai_1;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address = new Address();

    public Person() {
    }
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void Input(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Tên: ");
        setName(scan.nextLine());
        System.out.print("Tuổi: ");
        setAge(scan.nextInt());
        scan.nextLine();
        System.out.println("Địa chỉ: ");
        address.Input();
    }
    public void Output(){
        System.out.printf("%-30s%-10d",getName(),getAge());
        address.Output();
    }
}
