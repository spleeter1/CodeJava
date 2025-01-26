
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J01018So_khong_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            int ok=1;
            int tong = 0;
            for(int i=0;i<s.length()-1;i++)
            {
                int digit1 = s.charAt(i) - '0';
                int digit2 = s.charAt(i + 1) - '0';

                if (Math.abs(digit1 - digit2) != 2) {
                    ok = 0;
                    break;
                }
                tong  += (s.charAt(i) - '0');
            }
            if(ok==1)   tong+=s.charAt(s.length()-1)-'0';
            if(ok==1 && tong %10 == 0)   System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}