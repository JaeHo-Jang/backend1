package a1115;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        // 5개의 정수를 입력받아
        // 입력받은 수 중 양수(+)만 합계를 구하라.

        Scanner sc = new Scanner(System.in);
        int sum = 0; // 합계
        for(int i=0; i < 5; i++) {
            System.out.printf("정수입력 : ");
            int n = sc.nextInt();

            //음수일때만, 합계에 누적하지 않고 넘어가려면 ↓
            if(n < 0) {
                continue;   // break랑 햇갈릴수 있으니 차이를 이해 해야한다.
                //남은 실행문을 무시하고, 다음반복으로 점프하겠다.
            }
            sum += n;
        }
        System.out.println("양수의 합 : " + sum);
        sc.close();
    }
}
