import java.util.*;
public class J05034Danh_sach_thuc_tap_1 {
        public static class student{
        public String ma;
        public String hoten;
        public String lop;
        public String email;
        public String dnName;
        public int stt;
        public student() {
        }

        public student(String ma, String hoten, String lop, String email, String dnName) {
            this.ma = ma;
            this.hoten = hoten;
            this.lop = lop;
            this.email = email;
            this.dnName = dnName;
        }
        
        public boolean kt(String abc){
            if(this.dnName.equals(abc))
            {
                return true;
            }
            else return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        student [] hs = new student[n];
        for(int i=0;i<n;i++)
        {
            hs[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            hs[i].stt=i+1;
        }
        int q = Integer.parseInt(sc.nextLine());
        String dnString[] = new String[q];
        for(int i=0;i<q;i++)   dnString[i] = sc.nextLine();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(hs[i].hoten.compareTo(hs[j].hoten) < 0)
                {
                    student tmp = hs[i];
                    hs[i] = hs[j];
                    hs[j] = tmp;
                }
            }
        }
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(hs[j].kt(dnString[i]) == true){
                    System.out.println(hs[j].stt+" "+
                            hs[j].ma+" "+
                            hs[j].hoten+" "+
                            hs[j].lop+" "+
                            hs[j].email+" "+
                            hs[j].dnName);
                }
            }
        }
    }
}

