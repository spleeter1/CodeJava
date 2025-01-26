import java.util.Scanner;
public class J05009Tim_thu_khoa_ky_thi {
    public static class sv{
        public String hoten;
        public String birth;
        public float diem1;
        public float diem2;
        public float diem3;
        public int stt;
        public sv() {
        }

        public sv(String hoten, String birth, float diem1, float diem2, float diem3) {
            this.hoten = hoten;
            this.birth = birth;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }

        public float diem(){
            return diem1+diem2+diem3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        sv student[] = new sv[n];
        for(int i=0;i<n;i++)
        {
            student[i] = new sv(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            student[i].stt = i+1;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(student[i].diem() > student[j].diem())
                {
                    sv tmp = student[i];
                    student[i] = student[j];
                    student[j] = tmp;
                }
            }
        }
        float ans=student[0].diem();
        int i=0;
        while(i<n && student[i].diem() == ans)
        {
            System.out.println(student[i].stt+" "+student[i].hoten+ " " + student[i].birth+" "+String.format("%.1f", student[i].diem()));
            i++;
        }
    }
}