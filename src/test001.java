interface ITuLieu{
    public double getGia();
}
class TuLieu{
    public String ma;
    public String tenNhaXB;
    public double gia;
    public int soLuong;

    public TuLieu() {
    }

    public TuLieu(String tenNhaXB, double gia, int soLuong) {
        this.tenNhaXB = tenNhaXB;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
class Bao extends TuLieu implements ITuLieu{
    public String ngay;
    public String ten;

    public Bao() {
    }

    public Bao(String ngay, String ten) {
        this.ngay = ngay;
        this.ten = ten;
    }

    public Bao( String ten, String tenNhaXB,String ngay, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ngay = ngay;
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    @Override
    public String toString(){
        String tmp = this.getTen().toUpperCase().charAt(0) +"001";
        return tmp+" "+getTen()+" "+getNgay()+" "+getTen()+" "+String.format("%.0f", getGia());
    }
    @Override
    public double getGia(){
        int tmp = Integer.parseInt(this.getNgay().substring(3,5));
        if(this.getSoLuong()>200 || tmp == 1 || tmp == 2)   return gia/100*95;
        return gia;
    }
}
class SachHoc extends TuLieu implements ITuLieu{
    public String ten;
    public String tenTG;
    public int soTrang;

    public SachHoc() {
    }

    public SachHoc(String ten, String tenTG, int soTrang) {
        this.ten = ten;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public SachHoc(String ten, String tenTG, int soTrang, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ten = ten;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTen() {
        return ten;
    }

    public String getTenTG() {
        return tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override
    public String toString(){
        String tmp[] = getTen().split(" ");
        String temp = tmp[0].toUpperCase() + "002";
        return temp+" "+getTen()+getTenNhaXB()+" "+getSoTrang()+" "+String.format("%.0f",getGia());
    }
    @Override
    public double getGia(){
        if(getSoTrang()<=300 && getSoTrang()>=0)    return gia/100*95;
        else if(getSoTrang() > 300 && getSoTrang()<=500)    return gia/100*90;
        else return gia/100*85;
    }
}
public class test001 {
    public static void main(String[] args) {
        Bao b =new Bao("Hoa hoc tro","Tien Phong","02/04/2023",23000,100);
        System.out.println(b);
        SachHoc s =new SachHoc("Toan cao cap","Nhat tue",120,"Giao duc",80000,300);
        System.out.println(s);
    }
}