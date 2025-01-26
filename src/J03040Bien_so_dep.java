/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J03040Bien_so_dep {
    public static int kt1(String s)
    {
        if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10)) return 1;
        return 0;
    }
    public static int kt2(String s)
    {
        s=s.substring(5,8)+s.substring(9);
       // System.out.println(s.charAt(0));
        for(int i=1;i<=4;i++)
        {
            if( s.charAt(i)-'0' <=s.charAt(i-1)-'0')    return 0;
        }
        return 1;
    }
    public static int kt3(String s) {
        for(int i=5;i<=10;i++)
        {
          //  System.out.println(s.charAt(i));
            if(i != 8)
            {
                if(s.charAt(i) != '6' && s.charAt(i) != '8')    return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            if(kt1(s) == 1 || kt2(s) == 1 || kt3(s) == 1)   System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
