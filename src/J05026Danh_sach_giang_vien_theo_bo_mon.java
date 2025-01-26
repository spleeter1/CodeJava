import java.util.Scanner;
public class J05026Danh_sach_giang_vien_theo_bo_mon {
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
        int q= Integer.parseInt(sc.nextLine());
        for(int j=0;j<q;j++)
        {
            String pattern = sc.nextLine();
            String tmp[] = pattern.split(" ");
            String ans="";
            for(String i : tmp){
                ans+=i.toUpperCase().substring(0, 1);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+ans+":");
            for(int i=0;i<n;i++)
            {
                if(gv[i].getBoMon().equals(ans)){
                    System.out.println(gv[i].ma+" "+gv[i].name+" "+gv[i].getBoMon());
                }
            }
        }
    }
}
