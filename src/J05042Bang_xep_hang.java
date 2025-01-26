import java.util.Scanner;
public class J05042Bang_xep_hang {
    public static class SV{
        public String name;
        public int c,t;

        public SV() {
        }

        public SV(String name, int c, int t) {
            this.name = name;
            this.c = c;
            this.t = t;
        }
        public String getName()
        {
            String tmp[] = name.split(" " );
            return tmp[tmp.length-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SV sv[] = new SV[n];
        for(int i=0;i<n;i++)
        {
            sv[i] = new SV(sc.nextLine(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
            sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sv[i].c > sv[j].c)
                {
                    SV tmp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = tmp;
                }
                else if(sv[i].c == sv[j].c)
                {
                    if(sv[i].t < sv[j].t)
                    {
                        SV tmp = sv[i];
                        sv[i] = sv[j];
                        sv[j] = tmp;
                    }
                    else if(sv[i].t == sv[j].t)
                    {
                        if(sv[i].getName().compareTo(sv[j].getName())<0)
                        {
                            SV tmp = sv[i];
                            sv[i] = sv[j];
                            sv[j] = tmp;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++)    
        {
            System.out.println(sv[i].name+" "+sv[i].c+" "+sv[i].t);
        }
    }
}