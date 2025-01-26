import java.util.Scanner;

public class J03024So_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String s = sc.nextLine();
            int l = s.length();
            int dem1=0;
            int dem2=0;
            int ok=0;
            for(int i=0;i<l;i++)
            {
                //System.out.print(s.charAt(i)+" ");
                if(s.charAt(i) < '0' || s.charAt(i) > '9')
                {
                    ok=1;
                    break;
                }
                if((s.charAt(i) - '0')%2 == 0)
                {
                    dem1++;
                }
                else dem2++;
            }
            if(ok == 0){
                if(dem1 > dem2 ) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("INVALID");
            t--;
        }
    }
}
