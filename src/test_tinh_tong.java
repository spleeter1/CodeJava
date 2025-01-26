import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class test_tinh_tong {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;
            while(sc.hasNext()){
                try{
                    long x = Integer.parseInt(sc.next());
                    sum += x;
                }
                catch (Exception e){
                    continue;
                }
            }
            System.out.println(sum);
        }
        catch (FileNotFoundException e){
            throw  new RuntimeException(e);
        }
    }
}
