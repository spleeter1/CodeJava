
import java.util.Scanner;
import java.math.BigDecimal;
public class J01004So_ngto {
    public static void ktra(long n) {
        for(int i=2;i<n;i++)
        {
            if(i > Math.sqrt(n))
            {
                System.out.println("YES");
                return;
            }
            if(n%i == 0)    
            {
                System.out.println("NO");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n = sc.nextLong();
            ktra(n);
            t--;
        }
    } 
}