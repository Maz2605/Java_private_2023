package bai_2;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentServiceImpl studentService = new StudentServiceImpl();
        System.out.println("---------------Menu---------------");
        System.out.println("    1. Add Student");
        System.out.println("    2. Delete Student");
        System.out.println("    3. Search Student by name");
        System.out.println("    4. Sorted Student by score");
        System.out.println("    5. Show all Student");
        System.out.println("    0. Exit");
        System.out.println();
        int select;
        while (true){
            System.out.print("Select the ability you want: ");
            select = scan.nextInt();
            scan.nextLine();
            switch (select){
                case 1:
                    Student student = new Student();
                    System.out.print("Name: ");
                    student.setName(scan.nextLine());
                    System.out.print("Age: ");
                    student.setAge(scan.nextShort());
                    scan.nextLine();
                    System.out.println("Address: ");
                    Address address = new Address();
                    System.out.print("\tDistrict: ");
                    address.setDistrict(scan.nextLine());
                    System.out.print("\tCity: ");
                    address.setCity(scan.nextLine());
                    student.setAddress(address);
                    System.out.print("Score: ");
                    student.setScore(scan.nextDouble());
                    scan.nextLine();
                    studentService.addStudent(student);
                    student.setId(studentService.list.indexOf(student));
                    break;
                case 2:
                    System.out.print("Id: ");
                    int id = scan.nextInt();
                    studentService.deleteStudent(id);
                    break;
                case 3:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    studentService.searchStudent(name);
                    break;
                case 4:
                    studentService.sortedStudent();
                    break;
                case 5:
                    studentService.showAllStudent();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Error\nPlease select again");
                    break;
            }
        }
    }
}
