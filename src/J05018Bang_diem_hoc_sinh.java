import java.util.Scanner;
public class J05018Bang_diem_hoc_sinh {
    public static class student{
        public String hoten;
        public String ma;
        public double d[] = new double[10];
        public student() {
        }

        public student(Scanner sc) {
            this.hoten = sc.nextLine();
            for(int i=0;i<10;i++)
            {
                d[i] = Double.parseDouble(sc.next());
            }
            sc.nextLine();
        }
        public double dtb(){
            double tong = 0;
            for(int i=0;i<10;i++)
            {
                tong+=d[i];
            }
            tong+=d[0]+d[1];
            return Math.round(tong/12*10.0)/10.0;
        }
        public String XepLoai(){
            if(dtb() < 5)   return "YEU";
            else if(dtb() <7)   return "TB";
            else if(dtb() < 8)    return "KHA";
            else if(dtb() < 9)  return "GIOI";
            else return "XUAT SAC";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        student [] hs = new student[n];
        for(int i=0;i<n;i++)
        {
            hs[i] = new student(sc);
            hs[i].ma = "HS" + String.format("%02d", i+1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(hs[i].dtb() > hs[j].dtb())
                {
                    student tmp = hs[i];
                    hs[i] = hs[j];
                    hs[j] = tmp;
                }
                else if(hs[i].dtb() == hs[j].dtb())
                {
                    if(hs[i].ma.compareTo(hs[j].ma) > 0)
                    {
                        student tmp = hs[i];
                        hs[i] = hs[j];
                        hs[j] = tmp;
                    }
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(
                hs[j].ma+" "+
                hs[j].hoten + " "+String.format("%.1f",hs[j].dtb())+" ");
            System.out.println(hs[j].XepLoai());
        }
    }
}
