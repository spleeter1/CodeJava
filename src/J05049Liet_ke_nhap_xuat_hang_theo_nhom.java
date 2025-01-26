import java.util.Scanner;

public class J05049Liet_ke_nhap_xuat_hang_theo_nhom {
    public static class product{
        public String code;
        public long slg;

        public product() {
        }

        public product(String code, long slg) {
            this.code = code;
            this.slg = slg;
        }

        public double xuat(){
            if(code.charAt(0) == 'A')   return Math.round((double)this.slg*60/100);
            else return Math.round((double)this.slg*70/100);
        }

        public long DonGia(){
            if(code.charAt(4) == 'Y')   return 110000;
            else return 135000;
        }

        public long tien(){
            return (long)(DonGia()*xuat());
        }

        public double thue(){
            if(code.charAt(0) == 'A' && code.charAt(4) == 'Y')  return (double)tien()/100*8;
            if (code.charAt(0) == 'A' && code.charAt(4) == 'N')    return (double)tien()/100*11;
            if(code.charAt(0) == 'B' && code.charAt(4) == 'Y')     return (double)tien()/100*17;
            if(code.charAt(0) == 'B' && code.charAt(4) == 'N') return (double)tien()/100*22;
            return 0;
        }

        public void output()
        {
            System.out.println(code+" "+this.slg+" "+String.format("%.0f",this.xuat())+" "+this.DonGia()+" "+this.tien()+ " "+String.format("%.0f",this.thue()));
        }

        public char parttern(){
            return this.code.charAt(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        product sp[] = new product[n];
        for(int i=0;i<n;i++)
        {
            sp[i] = new product();
            sp[i].code = sc.nextLine();
            sp[i].slg = Long.parseLong(sc.nextLine());
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sp[i].thue() > sp[j].thue())
                {
                    product tmp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = tmp;
                }
            }
        }
        char ma = sc.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            if(ma == sp[i].parttern())
            {
                sp[i].output();
            }
        }
    }
}
