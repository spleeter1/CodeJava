/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J01017So_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            int ok=1;
            for(int i=0;i<s.length()-1;i++)
            {
                int digit1 = s.charAt(i) - '0';
                int digit2 = s.charAt(i + 1) - '0';

                if (Math.abs(digit1 - digit2) != 2) {
                    ok = 0;
                    break;
                }
            }
            
            if(ok==1)   System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
