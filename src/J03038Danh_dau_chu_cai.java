/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class J03038Danh_dau_chu_cai {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int []cnt = new int[128];
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            cnt[s.charAt(i)]++;
        }
        for(char i='a';i<'z';i++)
        {
            if(cnt[i] > 0)  
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
