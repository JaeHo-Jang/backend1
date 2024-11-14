package a1114;

import java.util.Scanner;

public class Index2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("숫자를 입력하세요 : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("양수입니다.");
        } else if (number < 0) {
            System.out.println("음수입니다.");
        } else if (number == 0) {
            System.out.println("제로입니다.");
        }
    }
}
