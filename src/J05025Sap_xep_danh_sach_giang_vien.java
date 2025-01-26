
import java.util.Scanner;


public class J05025Sap_xep_danh_sach_giang_vien {
    public static class lecturer{
        public String name;
        public String mon;
        public String ma;
        public lecturer() {
        }

        public lecturer(String name, String mon) {
            this.name = name;
            this.mon = mon;
        }
        
        public String getBoMon(){
            String tmp[] = this.mon.split(" ");
            String ans="";
            for(String i : tmp){
                ans+=i.toUpperCase().substring(0, 1);
            }
            return ans;
        }
        
        public String getTen(){
            String tmp[] = this.name.split(" ");
            return tmp[tmp.length-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        lecturer gv[] = new lecturer[n];
        for(int i = 0; i < n;i++)
        {
            gv[i] = new lecturer(sc.nextLine(),sc.nextLine());
            gv[i].ma = "GV"+String.format("%02d", i+1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(gv[i].getTen().compareTo(gv[j].getTen()) ==0)
                {
                    if(gv[i].ma.compareTo(gv[j].ma)<0)
                    {
                        lecturer tmp = gv[i];
                        gv[i] = gv[j];
                        gv[j] = tmp;
                    }
                }
                else if(gv[i].getTen().compareTo(gv[j].getTen()) < 0)
                {
                    lecturer tmp = gv[i];
                    gv[i] = gv[j];
                    gv[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(gv[i].ma+" "+gv[i].name+" "+gv[i].getBoMon());
        }
    }
}