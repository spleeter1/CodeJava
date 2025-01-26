import java.util.Scanner;
public class J05038Bang_ke_tien_luong {
        public static class Staff{
        public String ma;
        public String hoten;
        public String chucvu;
        public int luongcb;
        public int ngay;

        public Staff() {
        }

        
        public Staff(String hoten,  int luongcb, int ngay,String chucvu) {
            this.hoten = hoten;
            this.chucvu = chucvu;
            this.luongcb = luongcb;
            this.ngay = ngay;
        }
        
        public int pc(){
            if(chucvu.equals("GD")) return 250000;
            else if(chucvu.equals("PGD")) return 200000;
            else if(chucvu.equals("TP")) return 180000;
            else if(chucvu.equals("NV")) return 150000;
            return 0;
        }
        
        public int luongc(){
            return this.luongcb*this.ngay;
        }
        
        public double Thuong(){
            if (this.ngay >= 25) return (double)luongc()/100*20;
            else if(this.ngay >=22 && this.ngay <25)    return (double) luongc()/100*10;
            else return 0;
        }
        
        public double thunhap(){
            return this.luongc()+this.Thuong()+this.pc() ;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Staff nv[] = new Staff[n];
        for(int i=0;i<n;i++)
        {
            nv[i] = new Staff(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
            nv[i].ma = "NV"+String.format("%02d", i+1);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println( nv[i].ma+" "+nv[i].hoten+" "+nv[i].luongc()+" "+String.format("%.0f",nv[i].Thuong())+" "+ nv[i].pc()+" "+String.format("%.0f",(double)(nv[i].luongc())+nv[i].Thuong()+nv[i].pc()));
        }   
         System.out.print("Tong chi phi tien luong: ");
         int tong=0;
         for(Staff i:nv){
             tong+=i.thunhap();
         }
         System.out.println(tong);
    }
}