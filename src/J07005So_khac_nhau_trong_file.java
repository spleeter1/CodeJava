
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class J07005So_khac_nhau_trong_file {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream is = new DataInputStream(new FileInputStream("DATA.in"));
            //Scanner sc = new Scanner(System.in);
            List<Integer> a = new ArrayList<>();
            int cnt[] = new int [1005];
            for(int i=0;i<1005;i++) cnt[i]=0;
            int dem=0;
            while(is.readBoolean())
            {
                a.add(is.readInt());
                cnt[a.get(dem)] ++;
                dem++;
            }
            Collections.sort(a);
            System.out.println("Liệt kê các số tăng dần, ví dụ: ");
            for(int i=0;i<a.size();i++)
            {
                if(cnt[a.get(i)] !=0){
                    System.out.println(a.get(i)+" "+cnt[a.get(i)]);
                    cnt[a.get(i)] =0;
                }
            }
        } catch (FileNotFoundException e) {
            throw  new RuntimeException(e);
        }
    }
}