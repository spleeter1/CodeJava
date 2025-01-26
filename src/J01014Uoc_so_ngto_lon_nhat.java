
import java.util.Scanner;
import java.lang.Math;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J01014Uoc_so_ngto_lon_nhat {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long n = sc.nextLong();
            for(long j=2;j<= Math.sqrt(n) ;j++)
            {
                while(n % j ==0 && n/j != 1)
                {
                    n/=j;
                }
            }
            System.out.println(n);
            t--;
        }    
    }
}
