
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class test181 {
    //public class Cau1 {
    public static void main(String[] args) {
        GiaoDichVang g=new GiaoDichVang("2/3/2023", 100, 10,"9999");
        g.setMa();
        System.out.println(g);
        GiaoDichTT t=new GiaoDichTT("2/3/2023", 100, 10,23,"USD");
        t.setMa();
        System.out.println(t);
        t=new GiaoDichTT("2/3/2023", 100, 10,1,"vnd");
        t.setMa();
        System.out.println(t);
        
    }

//}
}
public class Cau2 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        Scanner in=new Scanner(System.in);
        n.nhapGDVang(in);
        n.nhapGDTT(in);
        n.nhapGDTT(in);
        n.out();
    }

}
public class Cau3_1 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        //n.out();
        Scanner in=new Scanner(System.in);
        String ma=in.nextLine();
        n.xoa(ma);
    }

}
public class Cau3_2 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        //n.out();
        Scanner in=new Scanner(System.in);
        String ma=in.nextLine();
        n.suaVang(ma,in);
    }

}

