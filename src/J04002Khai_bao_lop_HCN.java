/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.Scanner;
class Rectange{
    private double width;
    private double height;
    private String color;

    public Rectange() {
    }
    
    public Rectange(double width,double height,String color)
    {
        this.width = width;
        this.height=height;
        this.color=color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea()
    {
        return width*height;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }
}
public class J04002Khai_bao_lop_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        String c=sc.next();
        if(w>0 && h>0)
        {
            Rectange rect = new Rectange(w,h,c);
            System.out.print((int)rect.findPerimeter()+" "+(int)rect.findArea()+" "+rect.getColor());
        }
        else {
            System.out.println("INVALID");
        }
    }
}
