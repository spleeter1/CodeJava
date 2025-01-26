import java.util.Scanner;
public class J05024Liet_ke_sinh_vien_theo_nganh {
        public static class student{
        public String ma;
        public String hoten;
        public String lop;
        public String email;

        public int stt;
        public student() {
        }

        public student(String ma, String hoten, String lop, String email) {
            this.ma = ma;
            this.hoten = hoten;
            this.lop = lop;
            this.email = email;
        }
        
        public String getNganh(){
            String nganh="";
            if(this.ma.substring(3, 7).equals("DCKT"))  nganh="KE TOAN";
            else if(this.ma.substring(3, 7).equals("DCVT"))  nganh="VIEN THONG";
            else if(this.ma.substring(3, 7).equals("DCDT")) nganh="DIEN TU";
            else if(this.ma.substring(3, 7).equals("DCCN"))
            {
                if(this.lop.charAt(0) != 'E')   nganh = "CONG NGHE THONG TIN";
            }
            else if(this.ma.substring(3, 7).equals("DCAT"))
            {
                if(this.lop.charAt(0) != 'E')   nganh = "AN TOAN THONG TIN";
            }
            return nganh;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        student [] hs = new student[n];
        for(int i=0;i<n;i++)
        {
            hs[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            //hs[i].stt=i+1;
        }
        int q = Integer.parseInt(sc.nextLine());
        String nganhString[] = new String[q];
        for(int i=0;i<q;i++)   nganhString[i] = sc.nextLine();
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(hs[i].hoten.compareTo(hs[j].hoten) < 0)
//                {
//                    student tmp = hs[i];
//                    hs[i] = hs[j];
//                    hs[j] = tmp;
//                }
//            }
//        }
        for(int i=0;i<q;i++)
        {
            System.out.println("DANH SACH SINH VIEN NGANH "+nganhString[i].toUpperCase()+":");
            for(int j=0;j<n;j++)
            {
                //System.out.println(hs[j].ma.substring(3,7));
                if(hs[j].getNganh().equals(nganhString[i].toUpperCase())){
                    System.out.println(
                            hs[j].ma+" "+
                            hs[j].hoten+" "+
                            hs[j].lop+" "+
                            hs[j].email);
                }
            }
        }
    }
}
