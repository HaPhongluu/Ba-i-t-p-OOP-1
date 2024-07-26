package BTVNOPP1;

import java.util.Scanner;

public class GraduateStudent extends Student {
    @Override
    public double  calculate() {

        return 4.7;
    }
    protected String reseachTopic;

    public String getReseachTopic() {
        return reseachTopic;
    }

    public void setReseachTopic(String reseachTopic) {
        this.reseachTopic = reseachTopic;
    }
    public  GraduateStudent(){
        super();
    }

    public GraduateStudent(String studentId, String name, int age, String reseachTopic) {
        super(studentId, name, age);
        this.reseachTopic = reseachTopic;
    }
    @Override
    public void nhap(Scanner scan){
        super.nhap(scan);
        System.out.println("Nhập đề tài nghiên cứu: ");
        this.reseachTopic = scan.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+  "GraduateStudent{" +
                "reseachTopic='" + reseachTopic + '\'' +
                '}';
    }



}
