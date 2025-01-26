
import java.util.Scanner;
import java.util.Vector;
class SV{
    public String ma,ten,lop,email;

    public SV() {
    }

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    public String getTen(){
        String tmp[] = this.ten.toLowerCase().split("\\s");
        String ans="";
        for(String temp : tmp){
            ans+=temp.toUpperCase().substring(0,1)+temp.substring(1);
            ans+=" ";
        }
        return ans;
    }
    
}
public class J07033DanhSachSinhVien1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Vector<SV>
        SV sv = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        //System.out.println(sv.getTen());
    }
}

