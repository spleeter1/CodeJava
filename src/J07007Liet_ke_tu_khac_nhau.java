
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class J07007Liet_ke_tu_khac_nhau {
    public static class WordSet{

        public WordSet(String vanbaNin) {
        }
        
        public void xuly() throws FileNotFoundException{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext())
            {
                List<String> res = sc.next().toLowerCase();
            }
           
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
