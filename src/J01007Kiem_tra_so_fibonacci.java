import java.util.Scanner;
public class J01007Kiem_tra_so_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 100; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }  
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            int ok=0;
            for(int i=0;i<100;i++)
            {
                if(n == f[i])
                {
                    System.out.println("YES");
                    ok=1;
                    break;
                }
            }
            if(ok == 0) System.out.println("NO");
            t--;
        }
    }
}
