/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.math.BigInteger;
import java.util.Scanner;
public class J03013Hieu_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t>0)
        {
            String c = sc.next();
            String d = sc.next();
            BigInteger a = new BigInteger(c);
            BigInteger b = new BigInteger(d);
            int l = Integer.max(c.length(), d.length());
            BigInteger z = a.subtract(b).abs();
            String res = z.toString();
            int l1 = res.length();
            if(l1 < l)
            {
                int tmp = l-l1;
                for(int i=0;i<tmp;i++) {
                    System.out.print("0");
                }
                System.out.println(z);
            }
            else System.out.println(z);
            t--;
        }
    }
}
