package Bai_1;

public class Student extends Person{
    private double GPA;

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    public Student(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, int age, String address, double GPA) {
        super(name, age, address);
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("GPA: "+getGPA());
    }
}

