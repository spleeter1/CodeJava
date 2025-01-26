/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
import java.lang.Math;
public class J01026So_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int sqrtn = (int) Math.sqrt(n);
            if(sqrtn*sqrtn != n)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
            t--;
        }
                
    }
}
