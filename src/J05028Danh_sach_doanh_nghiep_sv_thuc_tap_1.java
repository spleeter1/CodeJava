
import java.util.Scanner;

public class J05028Danh_sach_doanh_nghiep_sv_thuc_tap_1 {
    public static class dn{
        public String ma;
        public String name;
        public int slg;

        public dn() {
        }

        public dn(String ma, String name, int slg) {
            this.ma = ma;
            this.name = name;
            this.slg = slg;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        dn firm[] = new dn[n];
        for(int i=0;i<n;i++)
        {
            firm[i] = new dn(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(firm[i].slg == firm[j].slg)
                {
                    if(firm[i].ma.compareTo(firm[j].ma)>0)
                    {
                        dn tmp = firm[i];
                        firm[i] = firm[j];
                        firm[j] = tmp;
                    }
                }
                else if(firm[i].slg > firm[j].slg){
                    dn tmp = firm[i];
                    firm[i] = firm[j];
                    firm[j] = tmp;
                }
            }
        }
        for(dn j:firm){
            System.out.println(j.ma+" "+j.name+" "+j.slg);
        }
    }
}
