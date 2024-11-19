package a1119;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열의 크기를 사용자로부터 입력받기
        System.out.println("배열 크기를 입력하세요:");
        int size = sc.nextInt();  // 사용자로부터 배열 크기 입력받기

        // 사용자 입력에 따라 배열 생성
        int[] arr = new int[size];

        // 배열 요소 입력받기
        System.out.println(size + "개의 배열 요소를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 요소 출력하기
        System.out.println("입력된 배열 요소:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");



            
        }
        //합계와 평균 구하기
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double)sum / size;

        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.2f\n " , avg);
    }
}
