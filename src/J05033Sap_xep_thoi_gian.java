import java.util.Scanner;
class time{
    public int hour;
    public int minute;
    public int sec;

    public int last_time()
    {
        int lt = hour*3600 + minute*60 + sec;
        return lt;
    }

}
public class J05033Sap_xep_thoi_gian {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        time tg[] = new time[n];
        for(int i=0; i < n ; i++){
            tg[i]=new time();
            tg[i].hour = sc.nextInt();
            tg[i].minute = sc.nextInt();
            tg[i].sec = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                if(tg[i].last_time() >  tg[j].last_time()){
                    time temp = tg[j];
                    tg[j] = tg[i];
                    tg[i] = temp;
                }
            }
            
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(tg[i].hour +" "+tg[i].minute +" "+tg[i].sec);
        }
    }
   
}
