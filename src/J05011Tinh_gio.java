import java.util.Scanner;
public class J05011Tinh_gio {
    public static class gamer{
        public String ma;
        public String hoten;
        public String in;
        public String out;

        public gamer() {
        }

        public gamer(String ma, String hoten, String in, String out) {
            this.ma = ma;
            this.hoten = hoten;
            this.in = in;
            this.out = out;
        }
        
        public int time(){
            int change_in = Integer.parseInt(in.substring(0,2))*60+Integer.parseInt(in.substring(3, 5));
            int change_out = Integer.parseInt(out.substring(0,2))*60+Integer.parseInt(out.substring(3, 5));
            return change_out-change_in;
        }
        
        public String timehmm(){
            int tg = time();
            int h = tg/60;
            int m = tg-h*60;
            String ans=String.format("%d", h)+" gio "+m+" phut";
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        gamer ng[] = new gamer[n];
        for(int i=0;i<n;i++)
        {
            ng[i] = new gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(ng[i].time() > ng[j].time())
                {
                    gamer tmp = ng[i];
                    ng[i] = ng[j];
                    ng[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ng[i].ma+" "+ng[i].hoten+" "+ng[i].timehmm());
        }
    }
}