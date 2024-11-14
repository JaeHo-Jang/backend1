package a1114;

import java.util.Scanner;

public class Index1 {
    public static void main(String[] args) {
        // 주어진 나이에 따라 "어린이", "청소년", "성인"을 분류하는 프로그램을 작성하세요. 나이에 따른 기준은 다음과 같습니다:
        // 0 ~ 12세: 어린이
        // 13 ~ 19세: 청소년
        // 20세 이상: 성인

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("어린이네요.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("청소년이군요.");
        } else if (age >= 20) {
            System.out.println("성인입니다.");
        }

    }
}
