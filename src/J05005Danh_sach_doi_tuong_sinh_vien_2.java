
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class J05005Danh_sach_doi_tuong_sinh_vien_2{
    public static class student{
        public String ma;
        public String hoten;
        public String birth;
        public String lop;
        public double gpa;

        public student() {
        }

        public student(String hoten, String lop, String birth,double gpa) {
            this.hoten = hoten.trim();
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
        public String getName(){
            String tmp[] = this.hoten.split( "[^a-zA-Z]+");
            String ans="";
            for(int i=0;i<tmp.length;i++)
            {
                tmp[i] = tmp[i].toUpperCase().charAt(0)+tmp[i].substring(1,tmp[i].length()).toLowerCase();
                ans+=tmp[i];
                if(i==tmp.length-1)   break;
                else ans+=" ";
            }
            return ans;
//            String[] s = hoten.split("[^a-zA-Z]+");
//            String ans = s[0].substring(0,1).toUpperCase() + s[0].substring(1,s[0].length()).toLowerCase();
//            for (int i = 1; i < s.length; i++) {
//                ans += " " + s[i].substring(0,1).toUpperCase() + s[i].substring(1,s[i].length()).toLowerCase();
//            }
//            return ans;
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
            return this.ma + " " + this.getName() + " " + this.lop + " " + getBirth() + " " + getGpa();
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
