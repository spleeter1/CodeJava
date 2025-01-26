import java.util.Scanner;
public class J05010Sap_xep_danh_sach_mat_hang {
    public static class products{
        public int stt;
        public String ten;
        public String nhom;
        public double mua;
        public double ban;

        public products() {
        }

        public products(String ten, String nhom, double mua, double ban) {
            this.ten = ten;
            this.nhom = nhom;
            this.mua = mua;
            this.ban = ban;
        }

        public double profit(){
            return this.ban-this.mua;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        products mh[] = new products[n];
        for(int i=0;i<n;i++)
        {
            mh[i] = new products(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            mh[i].stt = i+1;
        }      
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mh[i].profit() > mh[j].profit())
                {
                    products temp = mh[i];
                    mh[i] = mh[j];
                    mh[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(mh[i].stt +" "+mh[i].ten+" "+mh[i].nhom+" "+String.format("%.2f", mh[i].profit()));
        }
    }
}