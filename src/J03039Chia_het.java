
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class J03039Chia_het {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String c = sc.next();
            String d = sc.next();
            BigInteger a = new BigInteger(c);
            BigInteger b = new BigInteger(d);
            BigInteger z = a.mod(b);
            if(Integer.parseInt(z.toString())==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
