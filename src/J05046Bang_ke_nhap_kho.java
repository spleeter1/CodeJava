import java.util.Scanner;
class Mathang{
    public String ma;
    public String name;
    public int slg;
    public long dongia;
    
    public Mathang() {
    }

    public Mathang(String name, int slg, long dongia) {
        this.name = name;
        this.slg = slg;
        this.dongia = dongia;
    }

    public String getMa(){
        String tmp[] = this.name.split(" ");
        String matmp="";
        for(int i=0;i<2;i++){
            matmp+= tmp[i].toUpperCase().charAt(0);
        }
        return matmp;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }

    public long ChietKhau(){
        int x;
        if(this.slg > 10)   x=5;
        else if(this.slg <=10 && this.slg>=8)   x=2;
        else if(this.slg <8 && this.slg >=5)    x=1;
        else x=0;
        return this.dongia*this.slg*x/100;
    }
    
    public long ThanhTien(){
        return this.dongia*this.slg-this.ChietKhau();
    }
}
public class J05046Bang_ke_nhap_kho {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Mathang []mh = new Mathang[n];
        for(int i=0;i<n;i++)
        {
            mh[i] = new Mathang();
            mh[i].name = sc.nextLine();
            mh[i].slg = Integer.parseInt(sc.nextLine());
            mh[i].dongia = Long.parseLong(sc.nextLine());
        }
        for(int i=0;i<n;i++)
        {
            String tmp;
            int dem=1;
            for(int j=0;j<i;j++){
                if(mh[i].getMa().equals(mh[j].getMa()) ) 
                {
                    dem++;
                }
            }
            tmp = mh[i].getMa()+String.format("%02d", dem);
            mh[i].setMa(tmp);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(mh[i].ma+" "+mh[i].name+" "+mh[i].ChietKhau()+" "+mh[i].ThanhTien());
        }
    }
    
}
