import java.util.Scanner;
public class J03007So_dep_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            int l = s.length();
            int ok=0;
            int tong =0;
            for(int i = 0;i<= l/2 ;i++)
            {
                if(s.charAt(i) != s.charAt(l-1-i) )
                {
                    ok = 1;
                    break;
                }
            }
            if(s.charAt(0) != '8' || s.charAt(l-1) != '8')
            {
                ok = 1;
            }
            for(int i=0;i<l;i++)
            {
                tong+= s.charAt(i)-'0';
            }
            if(tong%10 != 0)    ok=1;
            if(ok == 0) System.out.println("YES");
            else System.out.println("NO");
            
            t--;
        } 
    }
}
