
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
public class phep_tinh_pham_vi_20 {
    public static void main(String[] args) {
        int range = 20; // Phạm vi số hạng (từ 0 đến range)
        int numberOfEquations = 20; // Số lượng phép tính cần tạo

        Random random = new Random();
        int cnt = 4;
        for (int i = 0; i < 400; i++) {
            if(cnt >= 3)
                System.out.println("NHOM "+i);
            int operand1 = random.nextInt(range); 
            int operand2 = random.nextInt(range);
            if(cnt >=2)
            {
                if(operand1 <20 && operand1 >=10)
                {
                    while(operand2 <20 && operand2>=10)
                    {
                        operand2 = random.nextInt(range);
                    }
                }
                System.out.println(operand1 + " + " + operand2 + " = ");
            }
            if(cnt<2)
            {
                operand1 = random.nextInt(range+1); 
                operand2 = random.nextInt(range+1);
                while(operand2 > operand1)
                {
                    operand2 = random.nextInt(range+1);
                }
                if(cnt == 0)
                {
                    cnt=4;
                }
                System.out.println(operand1 + " - " + operand2 + " = ");
            }
            cnt--;
        }
    }
}
