package main.java;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentRepository {
    private final ArrayList<Student> students;

    public StudentRepository(){
        students= new ArrayList<Student>();
    }
    public StudentRepository(ArrayList<Student> student){
        this.students=student;
    }
    public void AddStudents(Student student){
        students.add(student);
    }
    public void ListOfStudentsFaculty(String faculty){
        System.out.println("Список студентов факультета: "+faculty);
        System.out.println();
        for (Student st:
                students) {
            if(st.getFaculty().equals(faculty))
                System.out.println(st.toString());
        }
    }
    public void ListsOfStudentsForEveryFaculty(){
        students.sort(Comparator.comparing(Student::getFaculty));
        for (Student st:
                students) {
            System.out.println(st.getFaculty()+" "+st.getSurname()+" "+st.getName());
        }
    }
    public void ListsOfStudentsForEveryCourse(){
        students.sort(Comparator.comparing(Student::getCourse));
        for (Student st:
                students) {
            System.out.println(st.getCourse()+" "+st.getFaculty()+" "+st.getSurname()+" "+st.getName());
        }
    }
    public void ListOfStudentsGroup(int group, String faculty, int course){
        System.out.println("Список студентов "+course+" курса "+group+" группы "+" факультета "+faculty);
        for (Student st:
                students) {
            if(st.getCourse()==course && st.getGroup()==group && st.getFaculty().equals(faculty))
                System.out.println(st.toString());
        }
    }
}
