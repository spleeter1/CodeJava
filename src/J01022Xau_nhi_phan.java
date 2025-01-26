/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J01022Xau_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] s = new String[100];
        s[0] = "0";s[1] = "0";s[2] = "1";
        for(int i=3;i<100;i++)   s[i] = s[i-2] + s[i-1];
            while(t>0)
            {
                int n= sc.nextInt();
                int k=sc.nextInt();
                String s1 = s[n];
                System.out.println(s1.charAt(k));
                t--;
            }
    }
}
