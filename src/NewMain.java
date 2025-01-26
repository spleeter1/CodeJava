class PTGT {
    String ma;
    private String hang;
    private String ngayLanBanh;
    private double giaGoc;

    public PTGT() {
    }

    public PTGT(String hang, String ngayLanBanh, double giaGoc) {
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaGoc = giaGoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }
    
}

interface IPTGT {
    public double getGiaBan();
}

class Oto extends PTGT implements IPTGT{
    private double dongCo;
    private int soCho;

    public Oto() {
    }

    public Oto(String hang, String ngayLanBanh, double giaGoc, int soCho,double dongCo) {
        super(hang, ngayLanBanh, giaGoc);
        this.dongCo = dongCo;
        this.soCho = soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }
    
    public void setMa(){
        super.setMa(ma);
        setMa(super.getHang().substring(0,2).toUpperCase() +"-001");
    }
    
    
    @Override
    public double getGiaBan(){
        int namnay = 2023;
        String tmp = this.getNgayLanBanh().substring(3);
        int year = 2023 - Integer.parseInt(tmp);
        if(year == 0)   return super.getGiaGoc()/100*10 + super.getGiaGoc();
        else if(year <3)   return (super.getGiaGoc()/100*90) +(super.getGiaGoc()/100*90)/100*10;
        else if(year< 6)    return (super.getGiaGoc()/100*80) + (super.getGiaGoc()/100*80)/100*10;
        else return super.getGiaGoc()/100*70 + (super.getGiaGoc()/100*70)/100*10;
    }
    @Override
    public String toString(){
        String giatmp = String.format("%.0f", getGiaBan());
        return getMa()+ " "+getHang()+" "+getNgayLanBanh()+ " "+getSoCho()+" "+giatmp;
        
    }
}

class XeTai extends PTGT implements IPTGT{
    private double trongTai;
    private boolean thung;

    public XeTai() {
    }

    public XeTai(String hang, String ngayLanBanh, double giaGoc,double trongTai, boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public boolean isThung() {
        return thung;
    }

    public void setThung(boolean thung) {
        this.thung = thung;
    }
    
    public void setMa(){
        super.setMa(ma);
        setMa("T-002");
    }
    
    @Override
    public String toString(){
        String giatmp = String.format("%.0f", getGiaBan());
        return getMa()+ " "+getHang()+" "+getNgayLanBanh()+ " "+getTrongTai()+" "+giatmp;
    }
    @Override
    public double getGiaBan(){
    int namnay = 2023;
    String tmp = this.getNgayLanBanh().substring(3);
    int year = 2023 - Integer.parseInt(tmp);
    if(isThung() == false)
    {
        if(year == 0)   return super.getGiaGoc()/100*10 + super.getGiaGoc();
        else if(year <3)   return (super.getGiaGoc()/100*90) +(super.getGiaGoc()/100*90)/100*10;
        else if(year< 6)    return (super.getGiaGoc()/100*80) + (super.getGiaGoc()/100*80)/100*10;
        else return super.getGiaGoc()/100*70 + (super.getGiaGoc()/100*70)/100*10;
    }
    else
    {
        if(year == 0)   return (super.getGiaGoc() + super.getGiaGoc()/100*10)/100*10 + (super.getGiaGoc() + super.getGiaGoc()/100*10) ;
        else if(year <3)   return (super.getGiaGoc()/100*90 + (super.getGiaGoc()/100*90)/100*10) +(super.getGiaGoc()/100*90 + (super.getGiaGoc()/100*90)/100*10)/100*10;
        else if(year< 6)    return (super.getGiaGoc()/100*80 + (super.getGiaGoc()/100*80 )/100*10 ) + (super.getGiaGoc()/100*80 + (super.getGiaGoc()/100*80 )/100*10)/100*10;
        else return (super.getGiaGoc()/100*70 + (super.getGiaGoc()/100*70)/100*10) + (super.getGiaGoc()/100*70 + (super.getGiaGoc()/100*70)/100*10)/100*10;
    }
    
}
}

public class NewMain {
    public static void main(String[] args) {
        Oto o=new Oto("Yaris", "02/2023", 32000, 4, 1.5);
        o.setMa();
        System.out.println(o);
        XeTai t=new XeTai("Ranger", "10/2018", 16000, 3.5, true);
        t.setMa();
        System.out.println(t);
    }
}