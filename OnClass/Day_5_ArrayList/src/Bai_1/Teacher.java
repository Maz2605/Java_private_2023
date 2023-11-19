package Bai_1;

public class Teacher extends Person{
    private int salary;
    public Teacher() {
    }

    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public Teacher(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override

    public void display(){
        super.display();
        System.out.println("Salary: "+getSalary());
    }
}
