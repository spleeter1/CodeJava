import java.util.Scanner;
public class J03008So_dep_3 {
    public static boolean ktngto(char c)
    {
        if(c == '2' || c == '3' || c== '5' || c=='7')   return true;
        return false;
    }
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
                if(s.charAt(i) != s.charAt(l-1-i) || ktngto(s.charAt(i)) == false)
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
