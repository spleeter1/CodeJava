
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class J07046Danh_sach_luu_tru {
    public static class Customer{
        public String ma,ten,maP;
        public Date in,out;
        public Customer() {
        }

        public Customer(String ma,String ten, String maP, Date in, Date out) {
            this.ma = ma;
            this.ten = ten;
            this.maP = maP;
            this.in = in;
            this.out = out;
        }
        public long getTgO(){
            return TimeUnit.MILLISECONDS.toDays(this.out.getTime() - this.in.getTime());
        }
        @Override
        public String toString() {
            return  ma+ " " + ten + " " + maP + " " + getTgO();
        }
    }
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\CodeJava\\HelloWorld\\src\\KHACH.in"));
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        Customer KH[] = new Customer[n];
        for(int i=0;i<n;i++)
        {
            KH[i] = new Customer("KH"+String.format("%02d", i+1), sc.nextLine(),sc.nextLine(), df.parse(sc.nextLine()), df.parse(sc.nextLine()));
        }
        Arrays.sort(KH,new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if(o1.getTgO() < o2.getTgO())   return 1;
                else return -1;
            }
        });
        for(Customer x:KH)  System.out.println(x);
    }
}
