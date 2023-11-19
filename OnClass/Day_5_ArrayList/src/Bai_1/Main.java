package Bai_1;

public class Main {
    public static void main(String[] args) {
        Student x = new Student("A",18,"NYC",4.0);
        Teacher y = new Teacher("B",24,"NYC",1000);
        System.out.print("Student");
        x.display();
        System.out.print("Teacher");
        y.display();
    }
}
