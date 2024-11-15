package a1115;

public class OddEvent {
    public static void main(String[] args) {
        // 1~20까지의 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		// 1+3+5+7+9+11+13+15+17+19 = sum1
		// 2+4+6+8+10+12+14+16+18+20 = sum2

        int sum1 = 0; // 홀수의 합
        int sum2 = 0; // 짝수의 합
        int i = 1;     // 1부터 시작

        // while 문을 사용하여 1부터 20까지 반복
        while (i <= 20) {
            if (i % 2 == 0) { // 짝수일 때
                sum2 += i;  // 짝수 합계에 더함
            } else {         // 홀수일 때
                sum1 += i;  // 홀수 합계에 더함
            }
            i++;  // i 값을 1씩 증가시킴
        }
        System.out.println("홀수의 합계: " + sum1);
        System.out.println("짝수의 합계: " + sum2);
    }
}
