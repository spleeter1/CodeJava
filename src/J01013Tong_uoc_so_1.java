/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J01013Tong_uoc_so_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int tong = 0;
        for(int i=0;i<n;i++)
        {
            int tmp = a[i];
            for(int j=2;j<= Math.sqrt(tmp);j++)
            {
                while(tmp % j ==0)
                {
                    tmp/=j;
                    tong+=j;
                }
            }
        }
        System.out.println(tong);
    }
}
