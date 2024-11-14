package a1114;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println();
        int number = 7;

        String result = (number % 2 == 0) ? "짝수" : "홀수";
        // 조건식 ?   ==>  조건이 참일 때 값 : 조건이 거짓일 때 값
        System.out.println(result);
    }
}
