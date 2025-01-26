import java.util.Scanner;
public class J01008Phan_tich_thua_so_ngto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=1;k<=t;k++){
            long n;
            n = sc.nextLong();
            System.out.print("Test "+ k + ": ");
            for(int i=2; i<=n; i++){
                int cnt=0;
                while(n %i == 0)
                {
                    n/=i;
                    cnt++;
                }
                if(cnt!=0)  System.out.print(i + "(" +  cnt + ") ");
            }
            System.out.println("");
        }
    }
}