import java.util.Scanner;
public class J05073Tinh_toan_gia_ban {
    public static class product{
        public String ma;
        public int dongia;
        public int slg;

        public product() {
        }

        public product(String ma, int dongia, int slg) {
            this.ma = ma;
            this.dongia = dongia;
            this.slg = slg;
        }
        
        public double tien(){
            return dongia*slg;
        }
        
        public boolean kt(){
            if(ma.charAt(ma.length()-1) == 'C') return true;
            return false;
        }
        
        public double tong(){
            char tmp = ma.charAt(0);
            double res;
            double res2;
            double tongtien = tien();
            if(tmp == 'T')  
            {
                res = tien()*0.29;
                res2 = tien()*0.04;
            }
            else if(tmp == 'C') 
            {
                res = tien()*0.1;
                res2 = tien()*0.03;
            }
            else if(tmp == 'D') 
            {
                res = tien()*0.08;
                res2 = tien()*0.025;
            }
            else {
                res = tien()*0.02;
                res2 = tien()*0.005;
            }
            
            if(kt() == true)    tongtien=tongtien+res/100*95+res2;
            else tongtien=tongtien+res+res2;
            return tongtien*120/100/slg;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        product sp[]= new product[n];
        for(int i=0;i<n;i++){
            sp[i] = new product(sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        for(int i=0;i<n;i++){
            System.out.println(sp[i].ma+" "+String.format("%.2f",sp[i].tong()));
        }
    }
}