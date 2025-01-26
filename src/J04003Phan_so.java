import java.util.Scanner;
 class Pso{
     private long a;
     private long b;
    public Pso() {
    }
    public Pso(long a,long b)
    {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }
    public long psotg(long a,long b)
    {
        while(b!=0)
        {
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
 }
public class J04003Phan_so {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Pso p = new Pso(a,b);
        long ucln = p.psotg(a, b);
        System.out.println(a/ucln + "/" + b/ucln);
    }
}