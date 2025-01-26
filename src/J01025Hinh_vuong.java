/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import static java.lang.Math.min;
import static java.lang.Math.max;
import java.util.Scanner;
public class J01025Hinh_vuong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []a = new int [4];
        int []b = new int [4];
        for(int i=0;i<4;i++) a[i]= sc.nextInt();
        for(int i=0;i<4;i++)    b[i] = sc.nextInt();
        int mint1 = min(a[0],b[0]);
        int mint2 = min(b[1],a[1]);
        int maxp1 = max(a[2],b[2]);
        int maxp2 = max(a[3],b[3]);
        int ans= max(maxp2 - mint2,maxp1-mint1);
        System.out.println(ans*ans);
    }
}
