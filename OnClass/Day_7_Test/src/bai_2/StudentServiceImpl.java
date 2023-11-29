package bai_2;

import java.util.*;

public class StudentServiceImpl implements StudentService{
    List<Student> list = new ArrayList<>();

    public StudentServiceImpl() {
    }

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        for (Student x:list) {
            if(x.getId() == id)
                list.remove(x);
        }
    }

    @Override
    public void searchStudent(String name) {
        for (Student x: list) {
            if (x.getName().equals(name)) {
                String string = x.toString();
                System.out.println(string);
            }
        }
    }

    @Override
    public void sortedStudent() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).getScore()<list.get(j).getScore())
                    Collections.swap(list,i,j);
            }

        }
    }

    @Override
    public void showAllStudent() {
        for (Student x: list) {
            String string = x.toString();
            System.out.println(string);
        }
    }
}
