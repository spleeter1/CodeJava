/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
 class Pso{
     private long a;
     private long b;
    public Pso() {
    }
    public Pso(long a,long b)
    {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }
    public long gcd(long a,long b)
    {
        while(b!=0)
        {
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
    public long lcm(long a,long b){
        return a*b/gcd(a, b);
    }
    public long qd(Pso p2){
        long msc = lcm(this.b, p2.b);
        return msc;
    }
 }
public class J04004Tong_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Pso p1 = new Pso(a,b);
        a = sc.nextLong();
        b = sc.nextLong();
        Pso p2 = new Pso(a,b);
        long msc = p1.qd(p2);
        long tmp1=msc/p1.getB();
        long tmp2=msc/p2.getB();
        a = p1.getA() * tmp1;
        b = p2.getA() * tmp2; 
        long tong = a+b;
        Pso ans = new Pso(tong,msc);
        System.out.println(tong/ans.gcd(tong, msc)+"/"+msc/ans.gcd(tong, msc));
    }
}