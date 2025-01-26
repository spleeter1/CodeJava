/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
class thunhap{
    private String ma;
    private String name;
    private int luong;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    
    public thunhap(){
    }
    public thunhap(String ma, String name, int luong) {
        this.ma = ma;
        this.name = name;
        this.luong = luong;
    }
    
    public int heso(){
        String tmp = this.ma.substring(2);
        int pc = Integer.parseInt(tmp);
        return pc;
    }
    
    public int phucap(){
        String tmp = this.ma.substring(0,2);
        String ht = "HT";
        String hp = "HP";
        String gv = "GV";
        if(tmp.equals(ht))
        {
            return 2000000;
        }
        else if(tmp.equals(hp))   return 900000;
        else return 500000;
    }
    
}
public class J04015Tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        int luong = sc.nextInt();
        thunhap tn = new thunhap(ma,name,luong);
        int tong_thu = tn.getLuong() * tn.heso() + tn.phucap();
        System.out.println(tn.getMa() + " " + tn.getName() + " " +tn.heso() +" " + tn.phucap() +" " + tong_thu);
    }
}
