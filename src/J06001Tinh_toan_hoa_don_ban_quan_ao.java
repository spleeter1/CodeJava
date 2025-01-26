import java.util.*;
import java.lang.*;
public class J06001Tinh_toan_hoa_don_ban_quan_ao {
    public static class SanPham{
        public String ma;
        public String ten;
        public double gia1;
        public double gia2;

        public SanPham() {
        }

        public SanPham(String ma, String ten, double gia1, double gia2) {
            this.ma = ma;
            this.ten = ten;
            this.gia1 = gia1;
            this.gia2 = gia2;
        }
        
    }
    public static class HoaDon{
        public SanPham sp;
        public String ma;
        public int slg;
        public int loai;
        public double tien;
        public String maMoi;
        public HoaDon() {
        }
        
        public HoaDon( String ma, int slg) {
            this.ma = ma;
            this.slg = slg;
        }
        public void setSp(SanPham sp){
            this.sp = sp;
        }
        public double discount(){
            double gia;
            if(ma.substring(2,3).equals("1"))
            {
                gia = this.sp.gia1;
            }
            else gia=this.sp.gia2;
            if(slg >= 50)  return gia*slg/100*15;
            else if(slg >= 100) return gia*slg/100*30;
            else return gia*this.slg/100*50;
        }
        public double total(){
            double gia;
            if(ma.substring(2,3).equals("1"))
            {
                gia = this.sp.gia1;
            }
            else gia= this.sp.gia2; 
            return gia*this.slg-this.discount();
        }
        public void setmaMoi(String ma,int i){
            this.maMoi = ma+"-"+String.format("%03d", i+1);
        }
        @Override
        public String toString(){
            return maMoi+" "+sp.ten+" "+discount()+" "+total();
        }
    }
    public static void main(String[] args) {
        List<SanPham> dsSp = new ArrayList<>();
        List<HoaDon> dsHd = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<n;i++)
        {
            SanPham tmp = new SanPham(sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            dsSp.add(tmp);
        }
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++)
        {
            HoaDon tmp= new HoaDon(sc.next(),Integer.parseInt(sc.next()));
            for(int j = 0;j<n;j++)
            {
                if(dsSp.get(j).ma.equals(tmp.ma.substring(0,2)))
                {
                    tmp.setSp(dsSp.get(j));
                    tmp.setmaMoi(tmp.ma, i);
                }
            }
            dsHd.add(tmp);
        }
        Collections.sort(dsHd,new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1,HoaDon o2){
                if(o1.total() < o2.total()) return 1;
                else return -1;
            }
        });
        for(HoaDon x: dsHd){
            System.out.println(x);
        }
    }
}
