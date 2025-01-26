
import java.util.Scanner;
public class J03010Dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        int cnt=0;
        String []res = new String[100];
        for(int i=0;i<100;i++)  res[i] ="";
        int []cnt2 = new int [100];
        for(int i=0;i<100;i++)  cnt2[i]=1;
        while(t > 0)
        {
            String s = sc.nextLine();
            String []stmp = new String[100];
            for(int i=0;i<100;i++)  stmp[i] = "";
            int dem = 0;
            s=s.trim();
            for(int i=0;i< s.length() ; i++)
            {
                if(s.charAt(i) == ' ' && s.charAt(i+1) !=' ')   dem++;
                else if(s.charAt(i)  == ' ' && s.charAt(i+1) == ' ') continue; 
                else stmp[dem]+=s.charAt(i);
            }
            for(int i=0;i<= dem;i++)
            {
                stmp[i] = stmp[i].toLowerCase();
            }
            
            //System.out.print(stmp[dem]);
            res[cnt]+=stmp[dem];
            
            for(int i =0 ;i<dem;i++)
            {
                //System.out.print(stmp[i].charAt(0));
                res[cnt] += stmp[i].charAt(0);
            }
            System.out.print(res[cnt]);
            for(int i=0;i<cnt;i++)
            {
                //System.out.print(res[i]+" ");
                if(res[cnt].equals(res[i]) == true)
                {
                    cnt2[i]++;
                    System.out.print(cnt2[i]);
                    break;
                }
            }
            cnt++;
            System.out.println("@ptit.edu.vn");
            t--;
        }
    }
}