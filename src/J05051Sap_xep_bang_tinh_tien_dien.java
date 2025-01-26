/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
class table{
    public String ma="KH";
    public String type;
    public int stt;
    public double old;
    public double nnew;

    public table(String type, int stt, double old, double nnew) {
        this.type = type;
        this.stt = stt;
        this.old = old;
        this.nnew = nnew;
    }

    public double sd(){
        return nnew-old;
    }
    
    public int heso(){
        if("KD".equals(type))  return 3;                                                       
        if("NN".equals(type)) return 5;                                                       
        if("TT".equals(type)) return 4;                                                        
        if ("CN".equals(type)) return 2;   
        return 0;
    }
    
    public double thanhtien(){
        return this.sd()*this.heso()*550;
    }
    
    public double phutroi(){
        if(this.sd() < 50)   return Math.round(0);                                                
        if(this.sd() <= 100) return Math.round(this.thanhtien()*35/100);
        if(this.thanhtien()> 100)   return Math.round(this.thanhtien());
        return 0;
    }
    
    public double tong(){
        return Math.floor(Math.round(this.thanhtien()+this.phutroi()));
    }
}
public class J05051Sap_xep_bang_tinh_tien_dien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        table t[] = new table[n];
        for(int i=0;i<n;i++)
        {
            String type = sc.nextLine();
            double old = Integer.parseInt(sc.nextLine());
            double nnew = Integer.parseInt(sc.nextLine());
            t[i] = new table(type, i+1, old, nnew);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(t[i].tong() < t[j].tong())
                {
                    table tmp = t[i];
                    t[i]=t[j];
                    t[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("KH"+String.format("%02d", t[i].stt));
            System.out.println(" "+t[i].heso()+" "+ String.format("%.0f",t[i].thanhtien())+" "+String.format("%.0f",t[i].phutroi())+" "+ String.format("%.0f",t[i].tong()));
        }
    }
}
