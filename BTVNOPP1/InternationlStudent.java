package BTVNOPP1;

import java.util.Scanner;

public class InternationlStudent extends UndergraduateStudent {
    @Override
 public double calculate() {
    return 6.5;
    }
    protected String quocGia;

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public InternationlStudent() {
        super();
    }

    public InternationlStudent(String studentId, String name, int age, String major, String quocGia) {
        super(studentId, name, age, major);
        this.quocGia = quocGia;
    }
    @Override
    public void nhap(Scanner scan){
        super.nhap(scan);
        System.out.println("Nhập Quốc gia ");
        this.quocGia = scan.nextLine();
    }


    @Override
    public String toString() {
        return super.toString()+  "InternationlStudent{" +
                "quocGia='" + quocGia + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}