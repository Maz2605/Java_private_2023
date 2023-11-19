package bai_1;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;


    public Address() {
    }
    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tXã: ");
        setCommune(scan.nextLine());
        System.out.print("\tHuyện: ");
        setDistrict(scan.nextLine());
        System.out.print("\tTỉnh: ");
        setCity(scan.nextLine());
    }
    public void Output(){
        System.out.printf("%-40s",getCommune()+" / "+getDistrict()+" / "+getCity());
    }
}
