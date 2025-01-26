import java.util.Scanner;
public class J03005Chuan_hoa_ho_ten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
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
                stmp[i] = Character.toUpperCase(stmp[i].charAt(0)) + stmp[i].substring(1);
            }
            stmp[0] = stmp[0].toUpperCase();
            for(int i =1 ;i<=dem;i++)
            {
                for(int j=0;j<stmp[i].length();j++)
                {
                    System.out.print(stmp[i].charAt(j));
                }
                if(i==dem)  System.out.print(",");
                System.out.print(" ");
            }
            System.out.print(stmp[0]);
            System.out.println("");
            t--;
        }
    }
}