/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02034Bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a = new int [n];
        for(int i=0;i<n;i++)    a[i] = sc.nextInt();
        int dem=0;
        int ok=1;
        for(int i=1;i<=a[n-1];i++)
        {
            if(i != a[dem])
            {
                ok = 0;
                System.out.println(i);
                dem--;
            }
            dem++;
        }
        if(dem==n && ok!=0)  System.out.println("Excellent!");
    }
}
