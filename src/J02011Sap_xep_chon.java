
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J02011Sap_xep_chon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++)    a[i] = sc.nextInt();
        int dem=0;
        for(int i=0;i<n-1;i++)
        {
            int tmp=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j] < a[tmp]) 
                {
                    tmp=j;
                }
            }
            int temp = a[i];
            a[i] = a[tmp];
            a[tmp] = temp;    
            dem++;
            System.out.print("Buoc "+dem+": ");
            for(int j=0;j<n;j++) 
            {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
