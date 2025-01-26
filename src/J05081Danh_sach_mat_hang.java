//import java.util.Scanner;
//class mathang{
//    public String ma = "MH";
//    public int stt;
//    public String ten;
//    public String dvi;
//    public int mua;
//    public int ban;
//
//    public int profit(){
//        return this.ban-this.mua;
//    }
//    
//}
//public class J05081Danh_sach_mat_hang {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        mathang mh[] = new mathang[n+1];
//        for(int i=1;i<=n;i++)
//        {
//            //mh[i] = new mathang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//            mh[i].stt = i;
//            mh[i].ten = sc.nextLine();
//            mh[i].dvi = sc.nextLine();
//            mh[i].mua = Integer.parseInt(sc.nextLine());
//            mh[i].ban = Integer.parseInt(sc.nextLine());
//        }
//        
//        for(int i=1;i<n;i++)
//        {
//            for(int j=i+1;j<=n;j++)
//            {
//                if(mh[i].profit() < mh[j].profit())
//                {
//                    mathang temp = mh[i];
//                    mh[i] = mh[j];
//                    mh[j] = temp;
//                }
//            }
//        }
//        for(int i=1;i<n;i++)
//        {
//            for(int j=i+1;j<=n;j++)
//            {
//                if(mh[i].profit() == mh[j].profit() && mh[i].stt > mh[j].stt )
//                {
//                    mathang temp = mh[i];
//                    mh[i] = mh[j];
//                    mh[j] = temp;
//                }
//            }
//        }
//        for(int i=1;i<=n;i++)
//        {
//            System.out.print(mh[i].ma);
//            System.out.print(String.format("%03d ",mh[i].stt));
//            System.out.println( mh[i].ten+" "+ mh[i].dvi+ " "+mh[i].mua+" "+mh[i].ban+" "+mh[i].profit());
//        }
//    }
//}