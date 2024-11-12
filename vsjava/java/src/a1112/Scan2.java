package a1112;

import java.util.Scanner;   // 알트쉬프트 5

public class Scan2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //       ㄴ 이변수는 마음대로 선언해도 됨.
        //Scanner 객체 생성 System.in(콘솔)에서 입력받는다.
        String str = scaner.nextLine();    // 내가입력한 정수를 num에 저장하고
        System.out.println(str);    // 프린트하겠다.
    }     
}   