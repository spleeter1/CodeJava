/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J01021Tinh_luy_thua {
    static long m = (long) (1e9+7);
    public static long pow(long a,long b) {
        if(b == 0)  return 1;
        if(b==1)    return a%m;
        long x = pow(a, b/2);
        if(b %2 == 0)   return (x*x)%m;
        return (a*((x*x)%m))%m;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a,b;
        while(true)
        {
            a=sc.nextLong();
            b=sc.nextLong();
            if(a == 0 && b == 0)    break;
            System.out.println(pow(a, b));
        }
    }
}
