/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02020Liet_ke_to_hop_1 {
    static int []b;
    static int dem =0;
    public static void sinh(int i,int n,int k) {
        for(int j = b[i-1]+1;j<=n-k+i;j++)
        {
            if(i>k) return;
            b[i]=j;
            if(i == k)
            {
                dem++;
                for(int h=1;h <= k;h++ )  
                {
                    System.out.print(b[h]+" ");
                }
                System.out.println("");
            }
            else sinh(i+1, n, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n=sc.nextInt();
        int k =sc.nextInt();
        b = new int[k+1];
        dem =0;
        sinh(1, n, k);
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
