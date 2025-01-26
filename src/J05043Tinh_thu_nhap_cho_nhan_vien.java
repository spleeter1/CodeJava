
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J05043Tinh_thu_nhap_cho_nhan_vien {
    public static class Staff{
        public String ma;
        public String hoten;
        public String chucvu;
        public int luongcb;
        public int ngay;

        public Staff() {
        }

        
        public Staff(String hoten, String chucvu, int luongcb, int ngay) {
            this.hoten = hoten;
            this.chucvu = chucvu;
            this.luongcb = luongcb;
            this.ngay = ngay;
        }
        
        public int pc(){
            if(chucvu.equals("GD")) return 500;
            else if(chucvu.equals("PGD")) return 400;
            else if(chucvu.equals("TP")) return 300;
            else if(chucvu.equals("KT")) return 250;
            else return 100;
        }
        
        public int luongc(){
            return this.luongcb*this.ngay+this.pc();
        }
        
        public double TamUng(){
            double x=(double)((this.luongc()+this.pc())*2/3);
            x=Math.round(x/1000)*1000;
            if(x<25000) return x;
            else return 25000;
        }
        
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Staff nv[] = new Staff[n];
        for(int i=0;i<n;i++)
        {
            nv[i] = new Staff(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            nv[i].ma = "NV"+String.format("%02d", i+1);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println( nv[i].ma+" "+nv[i].hoten+" "+nv[i].pc()+" "+nv[i].luongcb*nv[i].ngay+" "+String.format("%.0f",nv[i].TamUng())+" "+String.format("%.0f",nv[i].luongc()-nv[i].TamUng()));
        }
    }
}
