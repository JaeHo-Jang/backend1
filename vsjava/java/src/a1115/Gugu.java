package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("구구단 수 입력 : ");
        int input = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            // System.out.println(input + " * " + i + " = " + input*i);
            int result = input * i;
            System.out.println(input + " * " + i + " = " + result);
        }
        sc.close();
    }
}
