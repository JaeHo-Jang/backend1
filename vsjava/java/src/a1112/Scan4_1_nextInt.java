package a1112;

import java.util.Scanner;

public class Scan4_1_nextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		int x = scanner.nextInt(); 
		
		System.out.print("y 값 입력: ");
		int y = scanner.nextInt();

        int result = x + y;
        System.out.println("x + y : " + result);
    }
}
