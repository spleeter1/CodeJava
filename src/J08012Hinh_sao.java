/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.*;
import java.util.Scanner;
public class J08012Hinh_sao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Vector<Integer>> v = new Vector<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= n; i++) {
            v.add(new Vector<>());
        }
        for(int i=1;i<n;i++)
        {
            int vt1 = sc.nextInt();
            int vt2 = sc.nextInt();
            v.get(vt1).add(vt2);
            v.get(vt2).add(vt1);
        }
        int ok=0;
        for(int i=1;i<=n;i++)
        {
            if(v.get(i).size() > 1)
            {
                if(v.get(i).size() == n-1 ){
                    if(ok==0)   ok=1;
                }
                else{
                    ok=2;
                    break;
                }
            } 
           // System.out.println(v.get(i).size());
        }
        if(ok == 2) System.out.println("No");
        else System.out.println("Yes");
    }
}
