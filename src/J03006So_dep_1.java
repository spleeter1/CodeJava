import java.util.Scanner;
public class J03006So_dep_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            int l = s.length();
            int ok=0;
            for(int i = 0;i<= l/2 ;i++)
            {
                if(s.charAt(i) != s.charAt(l-1-i) || (s.charAt(i)-'0')%2 !=0)
                {
                    ok = 1;
                    break;
                }
            }
            if(ok == 0) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
