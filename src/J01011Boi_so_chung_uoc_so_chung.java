
import java.util.Scanner;
import java.lang.Math;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J01011Boi_so_chung_uoc_so_chung {
    public static long gcd(long a,long b) {
        while(b!=0)
        {
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long lcm(long a, long b)
    {
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t>0)
        {
            long a,b;
            a = sc.nextLong();
            b = sc.nextLong();
            
            System.out.println(lcm(a,b) + " " + gcd(a, b));
            t--;
        }
    }
}
