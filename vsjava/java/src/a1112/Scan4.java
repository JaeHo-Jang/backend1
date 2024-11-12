package a1112;

import java.util.Scanner;

public class Scan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();   // 문자를 입력받는애 : nextLine    --> nextInt로 받으면 상관없다.
		int x = Integer.parseInt(strX);   // 숫자를 받기위해 parseInt로 바꿔줌.
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x+y " + result);

        // 내가 종료하기 전까지 계속 출력하고 싶다.
        while(true) {     // 중괄호 {}안을 무한히 반복 실행하겠다.
            System.out.print("입력 문자열 : ");
            String data = scanner.nextLine();
            if(data.equals("q")) {    // 입력된 문자열이 q라면 반복을 중지한다.
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }

        System.out.println("종료");
    }
}
