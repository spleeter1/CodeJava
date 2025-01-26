
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J01005Chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int cnt=0;
            long n = sc.nextLong();
            double h = sc.nextLong();
            for(int i=1;i<=n-1;i++)  
            {
                DecimalFormat df = new DecimalFormat("0.000000");
                double res=Math.sqrt((double)i/n)*h;
                System.out.print(df.format(res)+" ");
            }
            System.out.println();
            t--;
        }
    } 
}
