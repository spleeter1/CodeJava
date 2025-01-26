
import java.util.Scanner;
public class J05006Danh_sach_doi_tuong_nhan_vien {
    public static class employee{
        public String stt;
        public String name;
        public String gt;
        public String birth;
        public String dc;
        public String msThue;
        public String nglv;

        public employee() {
        }

        public employee(String name, String gt, String birth, String dc, String msThue, String nglv) {
            this.name = name;
            this.gt = gt;
            this.birth = birth;
            this.dc = dc;
            this.msThue = msThue;
            this.nglv = nglv;
        }
        
        @Override
        public String toString(){
            return this.stt+" "+this.name+" "+this.gt+" "+this.birth+" "+this.dc+" "+this.msThue+" "+this.nglv;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        employee nv[] = new employee[n];
        for(int i=0;i<n;i++){
            nv[i] = new employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            nv[i].stt = String.format("%05d", i+1);
        }
        for(int i=0;i<n;i++)
        {
          //  System.out.println(nv[i].getNam()+" "+nv[i].getThang()+" "+nv[i].getNgay());
            System.out.println(nv[i]);
        }
    }
}
