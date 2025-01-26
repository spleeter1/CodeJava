import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long n = sc.nextLong();
            int cnt=0;
            long tmp = (long) Math.sqrt(n);
            for(int i=1;i<= tmp;i++)
            {
                if(n%i == 0)    
                {
                    if(i%2 == 0) cnt++;
                    if((n/i)%2 == 0 )  cnt++;
                }       
            }
            if(tmp*tmp == n && tmp%2 == 0)    cnt--;
            System.out.println(cnt);
            t--;
        }
    }
}
