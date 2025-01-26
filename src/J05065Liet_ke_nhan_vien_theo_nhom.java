import java.util.Scanner;
public class J05065Liet_ke_nhan_vien_theo_nhom {
    public static class employee{
        public String name;
        public String ma;
        public employee() {
        }

        public employee(String ma, String name) {
            this.name = name;
            this.ma = ma;
        }
        
        public String getCV(){
            return ma.substring(0,2);
        }
        
        public int getBacLuong(){
            return Integer.parseInt(ma.substring(2,4));
        }
        
        public int getSoHieu(){
            return Integer.parseInt(ma.substring(4));
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        employee nv[] = new employee[n];
        int dem1=0;
        int dem2=0;
        int dem3=0;
        for(int i = 0; i < n;i++)
        {
            nv[i] = new employee(sc.next(),sc.nextLine().trim());
            if(nv[i].getCV().equals("GD"))  dem1++;
            if(nv[i].getCV().equals("TP"))   dem2++;
            if(nv[i].getCV().equals("PP"))   dem3++;
            if(dem1>1)  nv[i].ma = "NV"+nv[i].ma.substring(2);
            if(dem2>3)  nv[i].ma = "NV"+nv[i].ma.substring(2);
            if(dem3>3)  nv[i].ma = "NV"+nv[i].ma.substring(2);
        }
        int q= Integer.parseInt(sc.nextLine());
        for(int j=0;j<q;j++)
        {
            String pattern = sc.nextLine();
            employee nvtmp[] = new employee[1000];
            int cnt=0;
            for(int i=0;i<n;i++)
            {
                if(nv[i].ma.toLowerCase().contains(pattern.toLowerCase())){
                    
                    nvtmp[cnt] = nv[i];
                    cnt++;
                }
            }
            for(int i=0;i<cnt;i++)
            {
                for(int k =0;k<cnt;k++){
                    if(nvtmp[i].getBacLuong() == nvtmp[k].getBacLuong())
                    {
                        if(nvtmp[i].getSoHieu() < nvtmp[k].getSoHieu()){
                            employee tmp = nvtmp[i];
                            nvtmp[i] = nvtmp[k];
                            nvtmp[k] = tmp;
                        }
                    }
                    else if(nvtmp[i].getBacLuong() > nvtmp[k].getBacLuong())
                    {
                        employee tmp = nvtmp[i];
                        nvtmp[i] = nvtmp[k];
                        nvtmp[k] = tmp;
                    }
                }
            }
            for(int i = 0;i<cnt;i++)
            {
                System.out.println(nvtmp[i].name+" "+nvtmp[i].getCV()+" "+String.format("%03d",nvtmp[i].getSoHieu())+" "+String.format("%02d", nvtmp[i].getBacLuong()));
            }
            System.out.println();
        }
    }
}