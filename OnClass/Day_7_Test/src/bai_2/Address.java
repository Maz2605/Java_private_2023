package bai_2;

public class Address {
    private String district;
    private String city;
    private String name;

    public Address() {
    }

    public Address(String district, String city, String name) {
        this.district = district;
        this.city = city;
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "district='" + district + '\'' +
                ", city='" + city + '\'';
    }
}

