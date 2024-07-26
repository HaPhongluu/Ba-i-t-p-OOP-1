package BTVNOPP1;

import java.util.Scanner;

public class UndergraduateStudent extends Student {

    protected String major;

    @Override
   public double calculate() {
return 5;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public UndergraduateStudent(){
        super();
    }

    public UndergraduateStudent(String studentId, String name, int age, String major) {
        super(studentId, name, age);
        this.major = major;
    }
    @Override
    public void nhap(Scanner scan){
        super.nhap(scan);
        System.out.println("Sinh viên trên có chuyên ngành là: ");
        this.major = scan.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ "UndergraduateStudent{" +
                "major='" + major + '\'' +
                '}';
    }
}
