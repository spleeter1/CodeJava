
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J03025Xau_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            int l = s.length();
            int ok=0;
            for(int i = 0;i< l/2 ;i++)
            {
                if(s.charAt(i) != s.charAt(l-1-i))
                {
                    ok ++;
                }
            }
            if ((l % 2 == 0 && ok == 1) || (l % 2 == 1 && ok <= 1)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
