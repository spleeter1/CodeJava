/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
class mathang{
    public String name;
    public int slg;
    public double gia;
    public mathang(String nextLine, int parseInt, int parseInt1) {
    }

    
    public mathang(String name,int slg, double gia) {
        this.slg = slg;
        this.gia = gia;
        this.name = name;
    }
    
    public double tien()
    {
        return this.slg * this.gia;
    }
}
class khach{
    public String name;
    public String sdt;
    public String date;
    public int stt;
    public double tien;
    public khach() {
    }

    public khach(String name, String sdt, String date,int stt,double tien) {
        this.name = name;
        this.sdt = sdt;
        this.date = date;
        this.stt = stt;
        this.tien = tien;
    }
    
//    public int ktra(){
//        if(this.name.equals(name) && this.sdt.equals(this.sdt))
//        {
//            return this.stt++;
//        }
//        else return 1;
//    }
    public double tongtien(){
        return this.tien;
    }
}
public class Test_tao_danh_don_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        khach customer[] = new khach[t];
        for(int j=0;j<t;j++)
        {
            customer[j] = new khach();
            customer[j].name = sc.nextLine();
            customer[j].sdt = sc.nextLine();
            customer[j].date = sc.nextLine();
            for(int k=j-1;k>=0;k--)
            {
                if(customer[k].name.equals(customer[j].name) && customer[k].sdt.equals(customer[j].sdt))
                {
                    customer[j].stt=customer[k].stt++;
                }
                else customer[j].stt=1;
            }
            customer[j].stt = customer[j].stt++;
            int n = Integer.parseInt(sc.nextLine());
            mathang sp[] = new mathang[n];
            for(int i=0;i<n;i++)
            {
                sp[i] = new mathang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
                sp[i].name = sc.nextLine();
                sp[i].slg = Integer.parseInt(sc.nextLine());
                sp[i].gia = Integer.parseInt(sc.nextLine());
            }
            double tien = 0;
            for(int i=0;i<n;i++)
            {
                tien+=sp[i].tien();
            }
            customer[j].tien= tien;
        }
        int ok=0;
        for(int j=0;j<t;j++)
        {
            int nam = Integer.parseInt(sc.nextLine());
            int namkt = Integer.parseInt(customer[j].date.substring(6));
            if(nam == namkt)
            {
                ok = 1;
                System.out.print(customer[j].name.toUpperCase().charAt(0));
                for(int i=1;i<customer[j].name.length();i++)
                {
                    if(customer[j].name.charAt(i) != ' ' && customer[j].name.charAt(i-1) == ' ')
                    {
                        System.out.print(customer[j].name.toUpperCase().charAt(i));
                    }
                }
                System.out.print("001 " + customer[j].name +" "+customer[j].date +" "+ Math.round(customer[j].tongtien()));
            }
        }
        if(ok==0)System.out.println("khong co don hang");
    }
}