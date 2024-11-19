package a1119;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("5개의 배열 요소를 입력하시요");
        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
