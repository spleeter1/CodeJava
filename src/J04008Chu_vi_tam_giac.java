/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.text.DecimalFormat;
import java.util.Scanner;
class Point{
    private double x;
    private double y;

    public Point(){
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt( Math.pow(this.x - secondPoint.x,2) + Math.pow(this.y - secondPoint.y, 2)  );
    }
    
    public double distance(Point p1, Point p2){
        return Math.sqrt( Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y, 2)  );
    }
    
    @Override
    public String toString(){
        return x+" "+y;
    }
}
public class J04008Chu_vi_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point( x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point( x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point c = new Point( x, y);
            double kc1= a.distance(b);
            double kc2 = a.distance(c);
            double kc3 = b.distance(c);
            if(kc1 + kc2 <= kc3 || kc1+kc3<=kc2 || kc2+kc3<=kc1)
            {
                System.out.println("INVALID");
            }
            else{
                double cvi = kc1+kc2+kc3;
                DecimalFormat f = new DecimalFormat("0.000");
                System.out.println(f.format(cvi));
            }
            t--;
        }
    }
}
