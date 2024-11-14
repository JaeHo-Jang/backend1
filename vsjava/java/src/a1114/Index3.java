package a1114;

import java.util.Scanner;

public class Index3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력하시오 : ");
        int dal = scanner.nextInt();

        switch (dal) {
            case 3, 4, 5 -> // 브레이크없이 케이스문 두개 없이 이렇게 쓸수도 있음 12버전 이상부터 가능 --> 이런걸 표현식이라고 함
                System.out.println("봄");

            case 6, 7, 8 ->
                System.out.println("여름");

            case 9, 10, 11 ->
                System.out.println("가을");

            case 12, 1, 2 ->
                System.out.println("겨울");

            default ->
                System.out.println("월이 아닙니다.");

        }
    }
    // 1. 계절 출력
    // 사용자로부터 월(1~12)을 입력받아 해당 월에 맞는 계절을 출력하는 프로그램을 작성하세요.
    // 예시:
    // 3, 4, 5: 봄
    // 6, 7, 8: 여름
    // 9, 10, 11: 가을
    // 12, 1, 2: 겨울
    // 위의 문제를 swithc case문으로 작성해 보세요
    // 자바 12이전문법과 이후 문법으로 만들어 보세요

    // 2. 윤년판별을 삼항연산자로 만들어 보세요, 숫자 3을 입력하면 5 + 3 = 8을 출력

}
