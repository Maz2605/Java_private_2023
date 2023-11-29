package bai_2;

public interface StudentService {
    void addStudent(Student student);
    void deleteStudent(int id);
    void searchStudent(String name);
    void sortedStudent();
    void showAllStudent();
}
