
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class J05003Danh_sach_doi_tuong_sinh_vien_1 {
    public static class student{
        public String ma;
        public String hoten;
        public String birth;
        public String lop;
        public double gpa;

        public student() {
        }

        public student(String hoten, String lop, String birth,double gpa) {
            this.hoten = hoten;
            this.lop = lop;
            this.birth = birth;
            this.gpa = gpa;
        } 
        
        public String getMa(int n){
            return "B20DCCN"+String.format("%03d", n);
        }
        public String getGpa(){
            return String.format("%.2f", gpa);
        }
        public String getBirth(){
//            String tmp[] = birth.split("/");
//            int a[] = new int[3];
//            String ans ="";
//            for(int i=0;i<tmp.length;i++)
//            {
//                a[i] = Integer.parseInt(tmp[i]);
//                tmp[i] = String.format("%02d", a[i]);
//                ans+=tmp[i];
//                if(i==2)    break;
//                else ans+="/";
//            }
//            return ans;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date ngaysinhDate = sdf.parse(birth);
                birth = sdf.format(ngaysinhDate);
            } catch (ParseException e) {
                System.out.println(e);
            }
            return birth;
        }
 
        @Override
        public String toString() {
            return this.ma + " " + this.hoten + " " + this.lop + " " + getBirth() + " " + getGpa();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        student [] hs = new student[n];
        for(int i=0;i<n;i++)
        {
            hs[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()));
            hs[i].ma = hs[i].getMa(i+1);
        }
  
        for(int j=0;j<n;j++)
        {
            System.out.println(
//                    hs[j].ma+" "+
//                    hs[j].getName()+" "+
//                    hs[j].lop+" "+
//                    hs[j].getBirth()+" "+
//                    hs[j].getGpa());
                    hs[j]);
        }
    }
}