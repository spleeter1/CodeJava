import java.util.*;
import java.io.*;
public class J07004So_khac_nhau_trong_file {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            //Scanner sc = new Scanner(System.in);
            List<Integer> a = new ArrayList<Integer>();
            int cnt[] = new int [1005];
            for(int i=0;i<1005;i++) cnt[i]=0;
            int dem=0;
            while(sc.hasNext())
            {
                a.add(sc.nextInt());
                cnt[a.get(dem)] ++;
                dem++;
            }
            Collections.sort(a);
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
