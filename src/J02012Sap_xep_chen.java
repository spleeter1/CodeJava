
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J02012Sap_xep_chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++)    
        {
            a[i] = sc.nextInt();
        }
        
        int dem = 0;
        System.out.println("Buoc 0: "+ a[0]);
        for (int i = 1; i < n; i++)
        {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > x)
            {
                a[j + 1] = a[j];
                j --;
            }
            a[j + 1] = x;
            dem++;
            System.out.print("Buoc "+ dem+": ");
            for (int k = 0; k <= i; k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println("");
        }
    }
}
