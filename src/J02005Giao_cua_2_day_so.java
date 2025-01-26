/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
import java.util.Arrays;
public class J02005Giao_cua_2_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[m];
        int []b = new int[n];
        for(int i=0;i<m;i++)    a[i] = sc.nextInt();
        for(int j=0;j<n;j++)    b[j] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(a[i] < b[j])   i++;
            else if(a[i] > b[j])    j++;
            else {
                System.out.print(a[i] + " ");
                i++;j++;
            }
        }
    }
}
