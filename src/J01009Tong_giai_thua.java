/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J01009Tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=0;
        long tmp=1;
                
        for(int i=2;i<=n+1;i++)
        {
            ans+=tmp;
            tmp*=i;
        }
        System.out.println(ans);
    }
}
