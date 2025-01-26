/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02103Tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int h=1;h<=t;h++)
        {
            int n = sc.nextInt();
            int m =sc.nextInt();
            int [][]a = new int[n][m];
            int [][]b = new int[m][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)   
                {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int [][]c = new int[n][n];
            for(int i = 0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    c[i][j]=0;
                    for(int k=0;k<m;k++)
                    {
                        c[i][j] = c[i][j] + a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test "+h+":");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }   
    }
}
