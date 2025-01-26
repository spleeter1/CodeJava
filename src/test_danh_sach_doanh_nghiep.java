import java.io.*;
import java.util.*;
public class test_danh_sach_doanh_nghiep {
    public static class DoanhNghiep {
        public String maDN, tenDN;
        public int soSV;

        public DoanhNghiep(String maDN, String tenDN, int soSV) {
            this.maDN = maDN;
            this.tenDN = tenDN;
            this.soSV = soSV;
        }

        public String getMaDN() {
            return maDN;
        }

        @Override
        public String toString() {
            return maDN + " " + tenDN + " " + soSV;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        DoanhNghiep[] dn = new DoanhNghiep[n];
        for (int i = 0; i < n; i++) {
            dn[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(dn, (DoanhNghiep o1, DoanhNghiep o2) -> o1.getMaDN().compareTo(o2.getMaDN()));
        for (int i = 0; i < n; i++) {
            System.out.println(dn[i]);
        }
    }
}