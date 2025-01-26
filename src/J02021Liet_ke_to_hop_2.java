import java.util.Scanner;
public class J02021Liet_ke_to_hop_2 {
    static int []b;
    static int dem =0;
    public static void sinh(int i,int n,int k) {
        for(int j = b[i-1]+1;j<=n-k+i;j++)
        {
            if(i>k) return;
            b[i]=j;
            if(i == k)
            {
                dem++;
                for(int h=1;h <= k;h++ )  
                {
                    System.out.print(b[h]);
                }
                System.out.print(" ");
            }
            else sinh(i+1, n, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n=sc.nextInt();
        int k =sc.nextInt();
        b = new int[k+1];
        dem =0;
        sinh(1, n, k);
        System.out.println("");
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
