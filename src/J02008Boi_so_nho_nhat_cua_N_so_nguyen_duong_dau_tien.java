/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02008Boi_so_nho_nhat_cua_N_so_nguyen_duong_dau_tien {
    public static long gcd(long a,long b) {
        while(b!=0){
            long tmp = a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static long lcm(long a,long b) {
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            long ans = 1;
            for(int i=2;i<=n;i++)   ans=lcm(ans,i);
            System.out.println(ans);
            t--;
        }
    }
}
