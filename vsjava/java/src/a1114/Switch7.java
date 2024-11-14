package a1114;

import java.util.Scanner;

public class Switch7 {
    public static void main(String[] args) {
        // 간단한 계산기
        // 사용자로부터 두 숫자와 연산자를 입력받아 계산 결과를 출력하는 프로그램을 작성하세요. 연산자는 +, -, *, / 중 하나입니다.
        // 예시:
        // 숫자 5, 연산자 +, 숫자 3을 입력하면 5 + 3 = 8을 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하시오 : ");
        double num1 = scanner.nextDouble();
        System.out.print("연산자를 입력하세요(+, -, *, / 중 입력) : ");
        char oper = scanner.next().charAt(0); // 입력된 첫글자(인덱스 번호 0번)만 가지고 오겠다.
        System.out.print("두번째 숫자를 입력하시오 : ");
        double num2 = scanner.nextDouble();

        switch (oper) {
            case '+':
                System.out.println("결과 : " + (num1 + num2));
                break;
            case '-':
                System.out.println("결과 : " + (num1 - num2));
                break;
            case '*':
                System.out.println("결과 : " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("결과 : " + (num1 / num2));
                    break;
                } else {
                    System.out.println("0으로 나눌 수 없어요");
                }
                break;

                default :
                    System.out.println("잘못된 연산자 입니다.");
        }
        scanner.close();
    }
}
