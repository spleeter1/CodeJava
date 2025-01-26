/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J02017Thu_gon_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)    a[i] = sc.nextInt();
        int ok=1;
        while(ok==1)
        {
            ok=0;
            for(int i=0;i<n-1;i++)
            {
                if(a[i] != -1)
                {
                    if((a[i] + a[i+1]) %2 ==0)
                    {
                        a[i] = -1;
                        a[i+1] = -1;
                    }
                }
            }
            for(int i=0;i<n;i++)    
            {
                if(a[i] == -1)
                {
                    for(int j=i;j<n-1;j++)   a[j]=a[j+1];
                    n--;
                    i--;
                    ok=1;
                }
            }
        }
        System.out.println(n);
    }
}
