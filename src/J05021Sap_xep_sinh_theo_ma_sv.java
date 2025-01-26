import java.util.Scanner;
public class J05021Sap_xep_sinh_theo_ma_sv {
    public static class student{
        public String ma;
        public String hoten;
        public String lop;
        public String email;

        public student() {
        }

        public student(String ma, String hoten, String lop, String email) {
            this.ma = ma;
            this.hoten = hoten;
            this.lop = lop;
            this.email = email;
        } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1005;
        student [] hs = new student[n];
        int k=0;
        while(sc.hasNextLine())
        {
            hs[k] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            k++;
        }
  
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(hs[i].ma.compareTo(hs[j].ma) < 0)
                {
                    student tmp = hs[i];
                    hs[i] = hs[j];
                    hs[j] = tmp;
                }
            }
        }
        for(int j=0;j<k;j++)
        {
            System.out.println(
                    hs[j].ma+" "+
                    hs[j].hoten+" "+
                    hs[j].lop+" "+
                    hs[j].email);
        }
    }
}
