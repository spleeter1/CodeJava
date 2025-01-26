import java.util.*;
public class J05062Hoc_bong_sinh_vien {
    public static class students{
        public String hoten;
        public double tbc;
        public int rl;
        public int check;
        public int p;
        public students() {
        }

        public students(String hoten, double tbc, int rl) {
            this.hoten = hoten;
            this.tbc = tbc;
            this.rl = rl;
            point();
        }
       
        public void point(){
            if(tbc >= 3.6 && rl>=90 )   
            {
                this.p=3;
            }
            else if(tbc >=3.2 && rl>=80) 
            {
                this.p=2;
            }
            else if(tbc >=2.5 && rl>=70){
                this.p=1;
            }
            else 
            {
                this.p=0;
            }
        }
        public String hobo(){
            if(p == 3 )   
            {
                return "XUATSAC";
            }
            else if(p == 2) 
            {
                return "GIOI";
            }
            else if(p == 1){
                return "KHA";
            }
            else 
            {
                return "KHONG";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        students sv[] = new students[n];
        for(int i=0;i<n;i++)
        {
            sv[i] = new students(sc.nextLine(), Double.parseDouble(sc.next()), Integer.parseInt(sc.next()));
            sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            if(m<0) sv[i].p = 0;
            System.out.println("m = "+m);
            if(sv[i].p >0 && sv[i].check ==0&& m>0)
            {
                m--;
                sv[i].check = 1;
                if(m>0)
                {
                    for(int j=i+1;j<n;j++){
                        if(sv[i].tbc == sv[j].tbc && sv[i].rl == sv[j].rl && sv[j].check ==0);
                        {
                            m--;
                            sv[j].check = 1;
                        }
                    }
                } 
            }
        }
        //students temp[] = new students[n];
        for(int i=0;i<n;i++){
        //    temp[i] = sv[i];
            System.out.println(sv[i].hoten +": "+sv[i].hobo());
        }
    }
}