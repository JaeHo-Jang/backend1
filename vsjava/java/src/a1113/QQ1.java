package a1113;
import java.util.Scanner;
public class QQ1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    System.out.println("-------------------------------------------");
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 * num2));
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 / num2));
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 % num2));
        //                           ㄴ 출력 형식      ㄴ 출력형식에 대입된 변수
        //                       ㄴ 20 (연산) 10 = 값 표시   ㄴ 출력형식에 대입된 실제 변수 값 (20,10,계산값)
}
}
