package BTVNOPP1;

import java.util.Scanner;

abstract class Student {
    private String studentId;
    private String name;
    private  int age;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    public void nhap(Scanner scan){
        System.out.println("Nhập mã sinh viên");
        this.studentId= scan.nextLine();
        System.out.println("Nhập tên sinh viên");
        this.name= scan.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        this.age= Integer.parseInt(scan.nextLine());
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract double calculate();


    public void add(Student student) {
    }
}
