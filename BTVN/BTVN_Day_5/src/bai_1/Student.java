package bai_1;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria  = 2;

    public Student() {
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Id: ");
        setId(scan.nextInt());
        if(getId()==555)
            return;
        scan.nextLine();
        super.Input();
        System.out.print("Name class: ");
        setNameClass(scan.nextLine());
        System.out.print("GPA: ");
        setGpa(scan.nextFloat());
    }
    @Override
    public void Output(){
        System.out.printf("%-10d",getId());
        super.Output();
        System.out.printf("%-20s%-10.1f",getNameClass(),getGpa());
    }
    public boolean checkFall(){
        if (getGpa() < getCriteria())
            return true;
        else
            return false;
    }
}
