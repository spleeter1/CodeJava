
import java.util.Scanner;

public class J05036Tinh_gia_ban_1 {
    public static class product{
        public String name;
        public String dv;
        public int dongianhap;
        public int slg;
        public String ma;
        public product() {
        }

        public product(String name, String dv, int dongianhap, int slg) {
            this.name = name;
            this.dv = dv;
            this.dongianhap = dongianhap;
            this.slg = slg;
        }
        
        public double phivc(){
            return Math.round((double)(dongianhap*slg*5/100));
        }
        
        public double thanhtien(){
            return Math.round((double)(dongianhap*slg+phivc()));
        }
        
        public double giaban(){
            return Math.round((double)(thanhtien()+thanhtien()*2/100));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        product sp[] = new product[n];
        for(int i=0;i<n;i++)
        {
            sp[i] = new product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp[i].ma ="MH"+String.format("%02d", i+1);
        }
        for(product i:sp){
            System.out.println(i.ma+" "+i.name+" "+i.dv+" "
                    +String.format("%.0f",i.phivc())+" "
                    +String.format("%.0f",i.thanhtien())+" "
                    +String.format("%.0f",i.giaban()));
        }
    }
}