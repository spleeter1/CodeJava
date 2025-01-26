/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02014Diem_can_bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)    a[i] = sc.nextInt();

            int []tong1 = new int[n];
            int []tong2 = new int[n];
            tong1[0] = a[0];
            tong2[n-1] = a[n-1];
            int dem=1;
            for(int i=1;i<n;i++)
            {
                tong1[dem] = tong1[dem-1]+ a[i];
                tong2[n-1-dem] = tong2[n-dem] + a[n-1-dem];
                dem++;
            }
            int ok=1;
            for(int i=0;i<n;i++)
            {
                if(tong1[i] == tong2[i])
                {
                    System.out.println(i+1);
                    ok = 0;
                    break;
                }
            }
            if(ok == 1) System.out.println("-1");
            t--;
        }
    }
}
