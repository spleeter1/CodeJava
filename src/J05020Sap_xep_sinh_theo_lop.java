import java.util.Scanner;
public class J05020Sap_xep_sinh_theo_lop {
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
        int n = Integer.parseInt(sc.nextLine());
        student [] hs = new student[n];
        for(int i=0;i<n;i++)
        {
            hs[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
         
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(hs[i].lop.compareTo(hs[j].lop) == 0)
                {
                    if(hs[i].ma.compareTo((hs[j].ma))<0)
                    {
                        student tmp = hs[i];
                        hs[i] = hs[j];
                        hs[j] = tmp;
                    }
                }
                else if(hs[i].lop.compareTo(hs[j].lop) < 0)
                {
                    student tmp = hs[i];
                    hs[i] = hs[j];
                    hs[j] = tmp;
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(
                    hs[j].ma+" "+
                    hs[j].hoten+" "+
                    hs[j].lop+" "+
                    hs[j].email);         
        }
    }
}