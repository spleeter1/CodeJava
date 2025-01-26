import java.util.Scanner;
public class J05023Liet_ke_sinh_vien_theo_khoa {
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
        
        public String getKhoa(){
            String nam = this.lop.substring(1, 3);
            return nam;
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
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++)
        {
            String namString=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+namString+":");
            for(int j=0;j<n;j++)
            {
                if(hs[j].getKhoa().equals(namString.substring(2,4))){
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
