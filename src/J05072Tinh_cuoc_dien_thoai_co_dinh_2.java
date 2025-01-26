import java.util.*;
public class J05072Tinh_cuoc_dien_thoai_co_dinh_2 {
    public static class tinhcuoc{
        public String sdt;
        public String tinh;
        public String tg_in;
        public String tg_out;
        public int gia;
        public tinhcuoc() {
        }

        public tinhcuoc(String sdt, String tinh, String tg_in, String tg_out,int gia) {
            this.sdt = sdt;
            this.tinh =tinh;
            this.tg_in = tg_in;
            this.tg_out = tg_out;
            this.gia = gia;
        }       
        
        public int tg(){
            int start = Integer.parseInt(tg_in.substring(0,2))*60+Integer.parseInt(tg_in.substring(3,5));
            int end   = Integer.parseInt(tg_out.substring(0,2))*60+Integer.parseInt(tg_out.substring(3,5));
            if(kt() == false)
            {
                return (int)Math.ceil((double)(end-start)/3);
            }
            return end-start;
        }
        
        public boolean kt(){
            if(sdt.charAt(0) == '0')    return true;
            else return false;
        }
        
        public int tiendt(){
            return tg()*gia;
        }
    }
    public static class tinh{
        public String ma;
        public String ten;
        public int gia;

        public tinh() {
        }

        public tinh(String ma, String ten, int gia) {
            this.ma = ma;
            this.ten = ten;
            this.gia = gia;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        Map<String,tinh> tinhMap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            tinh province = new tinh(ma,ten,gia);
            
            tinhMap.put(ma, province);
        }
        int m = Integer.parseInt(sc.nextLine());
        tinhcuoc tien[] = new tinhcuoc[m];
        for(int i=0;i<m;i++){
            String sdt = sc.next();
            int ok=0;
            if(sdt.charAt(0) == '0')    ok=1;
            
            if(ok==1){
                tien[i] = new tinhcuoc(sdt, tinhMap.get(sdt.substring(1,3)).ten, sc.next(), sc.next(), tinhMap.get(sdt.substring(1,3)).gia);
            }
            else
                tien[i] = new tinhcuoc(sdt, "Noi mang", sc.next(), sc.next(), 800);
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(tien[i].tiendt() > tien[j].tiendt())
                {
                    tinhcuoc tmp = tien[i];
                    tien[i] = tien[j];
                    tien[j] = tmp;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(tien[i].sdt+" "+tien[i].tinh+" "+tien[i].tg()+" "+tien[i].tiendt());
        }
    }
}
