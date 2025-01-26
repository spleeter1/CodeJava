/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J01016Chu_so_4_va_chu_so_7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int []cnt = new int[20];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) - '0' == 4)  cnt[4]++;
            else if(s.charAt(i) - '0' == 7) cnt[7]++;
        }
        int ans = cnt[4] + cnt[7];
        if(ans==4 || ans == 7)  System.out.println("YES");
        else System.out.println("NO");
    }
}
