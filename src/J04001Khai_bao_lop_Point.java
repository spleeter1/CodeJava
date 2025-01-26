/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
class Point{
    private double x;
    private double y;
    
    public Point()
    {
        x=0;
        y=0;
    }
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    double distance(Point SecPoint)
    {
        return Math.sqrt(Math.pow(this.x - SecPoint.x,2) + Math.pow(this.y - SecPoint.y,2));
    }
    double distance(Point a,Point b)
    {
        return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
    }
    
    @Override
    public String toString(){
        return x+" "+y;
    }
}
public class J04001Khai_bao_lop_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            Point a = new Point(x,y);
            x=sc.nextDouble();
            y=sc.nextDouble();
            Point b = new Point(x,y);
            
            DecimalFormat f = new DecimalFormat("0.0000");
            System.out.println(f.format(a.distance(b)));
            t--;
        }
    }
}
