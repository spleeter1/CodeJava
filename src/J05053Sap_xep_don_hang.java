import java.util.*;
public class J05053Sap_xep_don_hang {
    public static class DonHang{
        public String name;
        public String ma;
        public double price;
        public int num;

        public DonHang() {
        }

        public DonHang(String name, String ma, double price, int num) {
            this.name = name;
            this.ma = ma;
            this.price = price;
            this.num = num;
        }
        
        public double discount(){
            if(ma.charAt(4) == '1'){
                return price*num/2;
            }
            else return price*num/100*30;
        }
        public double total(){
            if(ma.charAt(4) == '1'){
                return price*num/2;
            }
            else return price*num/100*70;
        }
        @Override
        public String toString(){
            return name+" "+ma+" "+ma.substring(1,4)+" "+String.format("%.0f",this.discount())+" "+String.format("%.0f",this.total());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DonHang dh[] = new DonHang[n];
        for(int i=0;i<n;i++)
        {
            dh[i] = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(dh,new Comparator<DonHang>(){
            @Override
            public int compare(DonHang o1,DonHang o2){
                return o1.ma.substring(1, 4).compareTo(o2.ma.substring(1, 4));
            }
            
        });
        for(int i=0;i<n;i++)
        {
            System.out.println(dh[i].toString());
        }
    }
}
