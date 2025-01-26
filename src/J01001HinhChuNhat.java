/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ngdna
 */
public class J01001HinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a<=0 || b<=0)    System.out.println("0");
        else System.out.println((a+b) *2 +" "+a*b);
    }
}
