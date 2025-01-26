/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
public class Test1_bai1 {
    public static final int N = (int) 2e6;
    public static int check[] = new int [N +5];
    public static void sang(){
        for(int i=2;i<N;i++){
            check[i] = 1;
        }
        for(int i=2;i<N;i++)
        {
            for(int j=i*i;j<N;j+=i)
            {
                if(check[j] == 1)   check[j]=0;
            }
        }
    }
//    public static int kt(long n)
//    {
//        if(n<2) return 0;
//        for(int j=2;j<=n;j++)
//        {
//            if(j>Math.sqrt(n))  return 1;
//            if(n%j == 0)    return 0;
//        }
//        return 0;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int t=sc.nextInt();
        while(t>0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][] = new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test 1:");
            for(int i=0;i<m;i++)
            {
                int ok=0;
                for(int j=0;j<n;j++)
                {
                    
//                    if(kt(a[i][j]) == 0)
                    if(check[a[i][j]] == 0)
                    {
                        ok=1;
                        break;
                    }
                }
                if(ok==0)   System.out.print(i+" ");
            }
            System.out.println("");
            t--;
        }
    }
}
