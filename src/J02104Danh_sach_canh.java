/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02104Danh_sach_canh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)    a[i][j] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i][j] == 1)
                    System.out.println("("+(i+1)+","+(j+1)+")");
            }
        }
    }
}
