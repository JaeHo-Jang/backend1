package a1114;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("현재 월을 입력하세요 : ");
        int num = scanner.nextInt();

        if (num >=3 && num <=5) {
            System.out.println("봄입니다.");
        }
        if (num >=6 && num <=8) {
            System.out.println("여름입니다.");
        }
        if (num >=9 && num <=11) {
            System.out.println("가을입니다.");
        }
        if (num == 12 && num == 1 && num == 2) {
            System.out.println("겨울입니다.");
        }
        
    }
}
