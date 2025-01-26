/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */

import java.util.Scanner;
class product{
    public String name;
    public String code;
    public int cost;
    public int slg;

    public product() {
    }

    
    public product(String name, String code, int cost, int slg) {
        this.name = name;
        this.code = code;
        this.cost = cost;
        this.slg = slg;
    }
    
    public String seq()
    {
        String seqq = code.substring(1,4);
        return seqq;
    }
    
    public int type()
    {
        int typee = code.charAt(4)-'0';
        return typee;
    }
    public int sale(){
        if(this.type() == 1)
        {
            return cost*50/100*slg;
        }
        else return cost*30/100*slg;
    }
    
    public int tong(){
        return slg*cost-this.sale();
    }

    private int round(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
public class J05052Tra_cuu_don_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        product sp[] = new product[n];
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String code = sc.nextLine();
            int cost = Integer.parseInt(sc.nextLine());
            int slg = Integer.parseInt(sc.nextLine());
            sp[i] = new product(name, code, cost, slg);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(sp[i].name +" "+ sp[i].code+" "+sp[i].seq()+" "+sp[i].sale()+" "+sp[i].tong());
        }
    }
}
