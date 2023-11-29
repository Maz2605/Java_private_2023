package bai_2;

public abstract class Person {
    private int id;
    private String name;
    private short age;
    private Address address;

    public Person() {
        address = new Address();
    }

    public Person(String name, short age, Address address) {
        this.name = name;
        this.age = age;
        address =new Address();
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public abstract String getCapacity();
    @Override
    public String toString() {
        return  "id= "+id +" ,name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.toString();
    }
}
