/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.math.BigInteger;
import java.util.Scanner;
public class J01002Tinh_tong_N_so_nguyen_dau_tien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n = sc.nextLong();
            System.out.println(n*(n+1)/2);
            t--;
        }
    }
}
