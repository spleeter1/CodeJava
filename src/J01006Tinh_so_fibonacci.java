import java.util.Scanner;

public class J01006Tinh_so_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long [] f = new long[100];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
            t--;
        }
    }
}
