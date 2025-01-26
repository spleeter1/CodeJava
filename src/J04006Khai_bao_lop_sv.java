/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class sv{
    private String hoten;
    private String birth;
    private String msv;
    private float gpa;

    public sv() {
    }
    
    public sv(String hoten, String birth, String msv, float gpa) {
        this.hoten = hoten;
        this.birth = birth;
        this.msv = msv;
        this.gpa = gpa;
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

    public float getGpa() {
        return gpa;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void doiNgaySinh() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date ngaysinhDate = sdf.parse(birth);
            birth = sdf.format(ngaysinhDate);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
public class J04006Khai_bao_lop_sv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String msv = sc.nextLine();
        String birth = sc.nextLine();
        float gpa = sc.nextFloat();
        
        
        sv Sv = new sv(name,birth,msv,gpa);
        Sv.doiNgaySinh();
        
        System.out.print("B20DCCN001 ");
        System.out.println(Sv.getHoten()+" "+Sv.getMsv()+" "+ Sv.getBirth()+" "+String.format("%.2f",Sv.getGpa()));
    }
}
