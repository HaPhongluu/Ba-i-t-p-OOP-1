package BTVNOPP1;

import java.util.ArrayList;
import java.util.Scanner;

public class University {
        private  ArrayList<Student> listStudent;

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public University() {
        listStudent = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        student.add(student);
    }
    public void displayAllStudent(){
        for (Student student:listStudent){
            System.out.println(student.toString());
    }

    }

    public static void main(String[] args) {


    
        University university = new University();

        Student student1=new UndergraduateStudent("U01","Văn",20,"Kinh tế");
        Student student2=new GraduateStudent("G01","Luu", 21, "Kinh tế Doanh nghiệp");
        Student student3=new InternationlStudent("I01", " alex",22,"Kế toán", "USA");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.displayAllStudent();
    }
}

