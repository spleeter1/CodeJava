import java.util.*;
public class J05059Xac_dinh_danh_sach_trung_tuyen {
    public static class Stu{
        public String ma;
        public String name;
        public double toan;
        public double ly;
        public double hoa;
        public int status = 0;
        public Stu() {
        }

        public Stu(String ma, String name, double toan, double ly, double hoa) {
            this.ma = ma;
            this.name = name;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }
        
        public double getKV(){
            String tmp = this.ma.substring(0, 3);
            if(tmp.equalsIgnoreCase("KV1")) return 0.5;
            else if(tmp.equalsIgnoreCase("KV2")) return 1.0;
            else return 2.5;
        }
        
        public double getDiem(){
            return this.toan*2 +this.ly +this.hoa+this.getKV();
        }

        public void setStatus(int status) {
            this.status = status;
        }
        
        public String kq(){
            if(this.status == 1)    return "TRUNG TUYEN";
            else return "TRUOT";
        }
        
        public String getAns(double tmp){
            int tmp1 =  (int) Math.round(tmp);
            if(tmp - (double)(tmp1) == 0)   
            {
                return String.format("%.0f", tmp);
            }
            return String.format("%.1f", tmp);
        }
        @Override
        public String toString(){
            return this.ma +" "+ this.name +" "+ this.getAns(this.getKV())+" "+this.getAns(this.getDiem())+" "+this.kq();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Stu [] sv = new Stu[n];
        for(int i=0;i<n;i++)
        {
            sv[i] = new Stu(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        int ct= Integer.parseInt(sc.nextLine());
        //Cách 1:
        Arrays.sort(sv,new  Comparator<Stu>(){
            @Override
            public int compare(Stu sv1,Stu sv2){
                return Double.compare(sv2.getDiem(),sv1.getDiem() );
            }
        });
        // Cách 2:
        // Arrays.sort(sv, (Stu sv1, Stu sv2) -> Double.compare(sv2.getDiem(),sv1.getDiem() ));
        double floor = 0;
        for(int i=0;i<ct;i++)
        {
            sv[i].setStatus(1);
            floor = sv[i].getDiem();
            if(i == ct-1)
            {
                for(int j = ct;j<n;j++)
                {
                    if(sv[ct-1].getDiem() == sv[j].getDiem()){
                        sv[j].setStatus(1);
                    }
                }
            }
        }
        System.out.println(String.format("%.1f", floor));
        for(Stu i : sv) System.out.println(i);
    }
}