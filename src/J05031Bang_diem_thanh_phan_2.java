import java.util.Scanner;
public class J05031Bang_diem_thanh_phan_2 {
    public static class student{
        public String ma;
        public String hoten;
        public String lop;
        public float d1;
        public float d2;
        public float d3;
        public int stt;
        public student() {
        }

        public student(String ma, String hoten, String lop,float d1,float d2,float d3) {
            this.ma = ma;
            this.hoten = hoten;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 =d3;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        student [] hs = new student[n];
        for(int i=0;i<n;i++)
        {
            hs[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            hs[i].stt=i+1;
        }
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
        for(int j=0;j<n;j++)
        {
            System.out.println(j+1+" "+
                hs[j].ma+" "+
                hs[j].hoten+" "+
                hs[j].lop+" "+
                String.format("%.1f", hs[j].d1)+" "+
                String.format("%.1f", hs[j].d2)+" "+
                String.format("%.1f", hs[j].d3));
        }
    }
}
