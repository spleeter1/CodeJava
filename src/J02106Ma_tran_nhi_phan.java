/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02106Ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int [n][3];
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<3;j++)    a[i][j] = sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int dem1=0,dem2=0;
            for(int j=0;j<3;j++)
            {
                if(a[i][j] == 1)    dem1++;
                else dem2++;
            }
            if(dem1 > dem2) cnt++;
        }
        System.out.println(cnt);
    }
}
