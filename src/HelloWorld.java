///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//
///**
// *
// * @author ngdna
// */
//public class HelloWorld {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.println("Hello PTIT.");
//    }
//    
//}
import java.util.Scanner;
class Sinhvien{
    public String ma;
    public String hoten;
    public int diem;
    public boolean gt;
     public Sinhvien() {
    }
     
     public void intput(){
         Scanner sc = new Scanner(System.in);
         this.ma = sc.nextLine();
         this.hoten = sc.nextLine();
         this.gt = sc.nextBoolean();
         diem = sc.nextInt();
         
     }
     public void output(){
         
         System.out.print(ma.toUpperCase());
         System.out.print(" "+hoten);
         if(diem>=5)    System.out.print(" dat");
         else System.out.println(" hoc lai");
     }
}
public class HelloWorld {
    public static void main(String[] args) {
        Sinhvien sv= new Sinhvien();
        sv.intput();
        sv.output();
    }
}
