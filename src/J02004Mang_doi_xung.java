/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02004Mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++)    a[i] = sc.nextInt();
            int ok = 1;
            for(int i=0;i<n/2;i++)
            {
                if(a[i] != a[n-i-1])
                {
                    ok = 0;
                    System.out.println("NO");
                    break;
                }
            }
            if(ok == 1) System.out.println("YES");
            t--;
        }
    }
}
