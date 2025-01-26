/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J03032Dao_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            String []tmp = new String[100];
            int dem=0;
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = "";
            }

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == ' ')
                {
                    dem++;
                }
                else    
                {
                    tmp[dem]+=s.charAt(i);
                }
            }
            for(int i = 0;i<=dem;i++)
            {
                for(int k = tmp[i].length() - 1;k >=0; k--)
                {
                    System.out.print(tmp[i].charAt(k));
                }
                System.out.print(" ");
            }
            System.out.println("");
            t--;
        }
    }
}
