/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
class sv{
    private String hoten;
    private String birth;
    private float diem1;
    private float diem2;
    private float diem3;

    public sv() {
    }
    
    public sv(String hoten, String birth, float diem1, float diem2, float diem3) {
        this.hoten = hoten;
        this.birth = birth;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    
    public float diem(float diem1,float diem2,float diem3){
        return diem1+diem2+diem3;
    }
}
public class J04005Khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        sv student = new sv(name, birth, diem1, diem2, diem3);
        
        System.out.println(student.getHoten()+" "+student.getBirth()+" "+student.diem(diem1, diem2, diem3));
    }
}
