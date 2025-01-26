import java.text.DecimalFormat;
import java.util.Scanner;

public class J01003Phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0 && b!=0)  System.out.println("VN");
        else if(a==0 && b==0)   System.out.println("VSN");
        else
        {
            double res = -b / a;
            DecimalFormat df = new DecimalFormat("0.00");
            String result = df.format(res);
            System.out.println(result);
        }
    }
}