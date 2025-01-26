import java.util.Scanner;
public class J05032Tre_nhat_gia_nhat {
    public static class person{
        public String name;
        public String birth;

        public person() {
        }

        public person(String name, String birth) {
            this.name = name;
            this.birth = birth;
        }
        public int year(){
            return Integer.parseInt(birth.substring(6));
        }
        public int month()
        {
            return Integer.parseInt(birth.substring(3,5));
        }
        public int day(){
            return Integer.parseInt(birth.substring(0,2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        person ng[] = new person[n];
        for(int i=0;i<n;i++)
        {
            ng[i] = new person(sc.next(), sc.next());
            //sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ng[i].year() == ng[j].year())
                {
                    if(ng[i].month() == ng[j].month())
                    {
                        if(ng[i].day() > ng[j].day())
                        {
                            person tmp = ng[i];
                            ng[i] = ng[j];
                            ng[j] = tmp;
                        }
                    }
                    else{
                        if(ng[i].month() > ng[j].month())
                        {
                            person tmp = ng[i];
                            ng[i] = ng[j];
                            ng[j] = tmp;
                        }
                    }
                }
                else{
                    if(ng[i].year()> ng[j].year())
                    {
                        person tmp = ng[i];
                        ng[i] = ng[j];
                        ng[j] = tmp;
                    }
                }
            }
        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(ng[i].name+ng[i].day()+ng[i].month()+ng[i].year());
//        }
        System.out.println(ng[0].name);
        System.out.println(ng[n-1].name);
    }
}
