import java.util.Scanner;
public class J05007Sap_xep_danh_sach_doi_tuong_nhan_vien {
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
        
        public int getNam(){
            return Integer.parseInt(birth.substring(6,10));
        }
        public int getThang(){
            return Integer.parseInt(birth.substring(3,5));
        }
        public int getNgay(){
            return Integer.parseInt(birth.substring(0,2));
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
            for(int j=0;j<n;j++)
            {
                if(nv[i].getNam()==nv[j].getNam())
                {
                    if(nv[i].getThang() == nv[j].getThang())
                    {
                        if(nv[i].getNgay() < nv[j].getNgay())
                        {
                            employee tmp = nv[i];
                            nv[i] = nv[j];
                            nv[j] = tmp;
                        }
                    }
                    else if(nv[i].getThang()< nv[j].getThang())
                    {
                        employee tmp = nv[i];
                        nv[i] = nv[j];
                        nv[j] = tmp;
                    }
                }
                else if(nv[i].getNam() < nv[j].getNam())
                {
                    employee tmp = nv[i];
                    nv[i] = nv[j];
                    nv[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
          //  System.out.println(nv[i].getNam()+" "+nv[i].getThang()+" "+nv[i].getNgay());
            System.out.println(nv[i].stt+" "+nv[i].name+" "+nv[i].gt+" " +nv[i].birth+" "+nv[i].dc+" "+nv[i].msThue+" "+nv[i].nglv);
        }
    }
}