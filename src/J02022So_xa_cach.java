import java.util.Scanner;
import java.lang.Math;
public class J02022So_xa_cach {
    public static int[] b;
    public static int[] vis;
    public static void hvi(int i,int n){
        for(int j=1;j<=n;j++)
        {
            if(vis[j] ==0)
            {
                vis[j]=1;
                b[i] = j;
                if(i == n)
                {
                    int ok=1;
                    for(int h=1;h<n;h++)
                    {
                        int tmp = b[h+1]-b[h];
                        if(Math.abs(tmp) == 1)
                        {
                            ok=0;
                            break;    
                        }
                    }
                    if(ok == 1)
                    {
                        for(int h=1;h<=n;h++)
                        {
                            System.out.print(b[h]);
                        }
                        System.out.println("");
                    }
                   
                }
                else hvi(i+1, n);
                vis[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            b = new int [n+1];
            vis =new int[n+1];
            for(int i=0;i<=n;i++)   
            {
                vis[i]=0;
                b[i]=0;
            }
            hvi(1, n);
            t--;
        }
    }
}