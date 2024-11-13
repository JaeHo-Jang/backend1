package a1113;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("첫번째 정수를 입력하세요 : ");
        String strX = scanner.nextLine(); // 문자를 입력받는애 : nextLine --> nextInt로 받으면 상관없다.
        int x = Integer.parseInt(strX); // 숫자를 받기위해 parseInt로 바꿔줌.

        System.out.print("두분째 정수를 입력하세요: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y : " + result);
        int result1 = x - y;
        System.out.println("x - y : " + result1);
        int result2 = x * y;
        System.out.println("x * y : " + result2);
        int result3 = x / y;
        System.out.println("x / y : " + result3);
        int result4 = x % y;
        System.out.println("x % y : " + result4);
    }
}
