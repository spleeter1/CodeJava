/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02007Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int k=1;k<=t;k++)
        {
            System.out.println("Test " + k+":");
            int n = sc.nextInt();
            int []a = new int[n];
            int []cnt = new int[100005];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            for(int i=0;i<n;i++)
            {
                if(cnt[a[i]] > 0)
                {
                    System.out.println(a[i]+" xuat hien "+cnt[a[i]]+ " lan");
                    cnt[a[i]]=0;
                }
            }
        }
    }
}
