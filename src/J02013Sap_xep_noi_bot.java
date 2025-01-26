
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J02013Sap_xep_noi_bot {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++)    a[i] = sc.nextInt();
        
       	int dem=0;
	for(int i=0;i<n;i++)
	{
            int check=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    check=1;
                }
            }
            if(check !=1)
            {
                break;
            }
            dem++;
            System.out.print("Buoc "+dem+": ");
            for(int j=0;j<n;j++) System.out.print(a[j]+" ");
            System.out.println("");
        }
    }
}